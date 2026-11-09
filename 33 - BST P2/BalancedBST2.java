import java.util.*;

// Order to solve this Question = determine inorder -> calculate balanced bst from sorted array
public class BalancedBST2 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
   
    //Step 1 - to calculate inorder sequence
    public static void getinorder(Node root , ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getinorder(root.left, inorder);
        inorder.add(root.data);
        getinorder(root.right, inorder);
    }
    
    //Step 2 - to calculate balanced bst
    public static Node createBST(ArrayList<Integer> inorder , int st , int end){
        if(st > end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid-1);
        root.right = createBST(inorder, mid+1, end);
        return root;

    }
    public static Node balancedBST(Node root){

        //STEP 1 - determine INORDER SEQUENCE
        ArrayList<Integer> inorder = new ArrayList<>();
        getinorder(root, inorder);

        //STEP2  - Sorted array(inorder sequence) to balanced bst
        root = createBST(inorder, 0, inorder.size()-1);
        return root;
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = balancedBST(root);
        preorder(root);
    /*
            GIVEN BST
                            8
                         /     \
                        6       10
                      /           \
                     5            11
                    /              \
                   3               12
    */

    /*              
            expected BST
                            8
                         /     \
                        5      11
                      /   \    /  \
                     3     6  10  12
    
    */

    }
}
