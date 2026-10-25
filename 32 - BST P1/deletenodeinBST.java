import java.util.*;
public class deletenodeinBST {
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

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node delete(Node root , int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{
            //CASE 1 : LEAF NODE
            if(root.left == null && root.right == null){
                return null;
            }

            //CASE 2 : SINGLE CHILD
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // CASE 3 : NODE HAVING BOTH CHILDREN
            //IS is the leftmost node in the right subtree
            Node IS = findinordersuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findinordersuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printinrange(Node root , int k1 , int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printinrange(root.left, k1, k2);
            System.out.println(root.data+" ");
            printinrange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printinrange(root.left, k1, k2);
        }
        else{
            printinrange(root.right, k1, k2);
        }
    }
    public static void main(String args[]){
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i = 0 ; i<values.length ; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        root = delete(root, 1);
        System.out.println();
        inorder(root);
        System.out.println();

        printinrange(root, 5, 12);

    }
}
