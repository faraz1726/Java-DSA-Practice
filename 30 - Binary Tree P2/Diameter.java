import java.util.*;
public class Diameter {
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

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh , rh) +1;
    }
    
    /*APPROACH 1 for calculating diameter */
    public static int diameter1(Node root){
        if(root == null){
            return 0;
        }
        int rightdia = diameter1(root.right); /*when it doesnt passes through root */
        int leftdia = diameter1(root.left);/*when it doesnt passes through root */
        int lh = height(root.left);
        int rh = height(root.right);
        int selfdia = lh+rh+1;/*when it passes through root , so extra +1 */
        return Math.max(selfdia ,Math.max(leftdia ,rightdia));    
    }

    /*APPROACH 2 for calculating diameter */
    static class Info{
        int dia;
        int ht;

        public Info(int dia , int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int dia = Math.max(Math.max(leftInfo.dia, rightInfo.dia), leftInfo.ht + rightInfo.ht + 1 );
        int ht = Math.max(leftInfo.ht, rightInfo.ht ) + 1;
        return new Info(dia, ht);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("height of tree is "+height(root));
        System.out.println("diameter of tree is "+diameter(root).dia);/*for getting diameter */
        System.out.println("height of tree is "+diameter(root).ht);/*for getting height */
    }
}
