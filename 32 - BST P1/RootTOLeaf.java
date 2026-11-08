
import java.util.*;
public class RootTOLeaf {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root , int val){
        if(root == null){
            root  =  new Node(val);
            return root;
        }

        //left subtree
        if(root.data > val){
            root.left = insert(root.left, val);
        }

        //right subtree
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }

   
    public static void printpath(ArrayList<Integer> path){
        for(int i  = 0 ; i<path.size() ; i++){
            System.out.print(path.get(i)+"-->");
        }
        System.out.println("NUll");
    }
    public static void root2leaf(Node root , ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printpath(path);
        }
        root2leaf(root.left ,path);
        root2leaf(root.right, path);
        path.remove(path.size()-1);//remove current node from the path while traversing back 
    }

    public static boolean validateBST(Node root , Node min , Node max){
        if(root == null){
            return true;
        }
        //cases for Root
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        //cases for leaf nodes
        return validateBST(root.left, min, root) && validateBST(root.right, root, max);
    }
    public static void main(String args[]){
        int values[] = {8,5,3,6,10,11,15};
        Node root = null;

        for(int i = 0 ; i<values.length ; i++){
            root = insert(root, values[i]);
        }

        root2leaf(root, new ArrayList<>());
        if(validateBST(root, null , null)){
            System.out.println("valid");
        }
        else{
            System.out.println("inValid");
        }
    }
}
