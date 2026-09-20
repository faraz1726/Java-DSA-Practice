import java.util.*;
public class PreorderBuildTree {
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

    // Binary tree class
    static class Binarytree{
        static int idx = -1;

        //buildtree function
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);
            return newnode;
        }

        //Preorder traversal function
        public static void preorder(Node root){
        if( root == null){
            //System.out.print(" -1 ");   it will give answer same as int nodes[] with -1 also printed
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
        
        }

        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ") ;
        }

    }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; 
        Binarytree tree = new Binarytree();
        Node root =  tree.buildtree(nodes);
        System.out.println(root.data);// it will give one

        System.out.print("the preporder traversal is  ");
        tree.preorder(root);
        System.out.println();

        System.out.print("the inorder traversal is ");
        tree.inorder(root);
        System.out.println();

        System.out.print("the postorder traversal is ");
        tree.postorder(root);
    }
    
}
