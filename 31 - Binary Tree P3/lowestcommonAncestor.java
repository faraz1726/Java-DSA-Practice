import java.util.*;
public class lowestcommonAncestor {
    //Node class
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data  = data;
            this.left = null;
            this.right = null;
        }
    }
    //get path(Node root , node , path) , here n is the node data and root.data is the data of root node.
    // this will store path from root to n (means node having data n) in the arraylist
    public static boolean getpath(Node root , int n , ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundleft = getpath(root.left, n, path);
        boolean foundright = getpath(root.right, n, path);
        if(foundleft || foundright){
            return true;
        }
        // if we didnt found our node in the leftsubtree and rightsubtree means , node is not present
        // so root will not be the part of our path , we remove it 
        path.remove(path.size()-1);
        return false;
    }
    // last common node will be lowest common ancestor
    public static Node lca(Node root , int n1 , int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getpath(root, n1, path1);
        getpath(root, n2, path2);
        // both of them will have the same starting root node as 1 , which is at index 0
        // thats why we are iterating from i = 0, i<size , until we didnt get different element 
        // path1 = [1,2,4]
        // path2 = [1,2,5]
        // so the last same node is present at i-1 index
        // suppose when i will be at 4 nd 5 means i = 2, so last same node is at index i-1 
        int i = 0;
        for( ; i<path1.size() && i<path2.size() ;i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        Node lca = path1.get(i-1);
        return lca;

    }

    public static Node lca2(Node root , int n1 , int n2){
        if(root == null){
            return null;
        }
        if(root.data == n1 || root.data == n2){
            return root;
        }
        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);

        //left lca = val , right lca = null, then
        // means both n1 , n2 exists on the left side
        if(rightlca == null){
            return leftlca;
        }

        //similarly if rightlca = value , leftlca = null
        // means both n1 , n2 exists on the right side
        if(leftlca == null){
            return rightlca;
        }
        // now this means one of them exists on leftside and other on right side 
        // so root is the only common ancestor of both of them , so return root
        // means when both leftlca && rightlca != null , return root
        return root;

    }
    public static void main(String args[]){

         /*       1
                /   \
               2     3
              / \   / \
             4   5  6  7
             
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4 , n2 = 5;
        System.out.println(lca2(root, n1, n2).data);
    }
    
}
