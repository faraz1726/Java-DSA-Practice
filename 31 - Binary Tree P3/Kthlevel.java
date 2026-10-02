import java.util.*;
import java.util.LinkedList;
public class Kthlevel {
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
    public static void levelorder(Node root , int k){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();// we have to add a null after a node , and remove it also
        q.add(root);
        q.add(null);// null is for printing from next line
        int m = 1;

        while (!q.isEmpty()) {
                // as you encounter element in queue remove it and print it 
                // when you encounter a null , mean go to the next line
            Node currnode = q.remove();
                // thats why we print next line , when we get a null 
            if (currnode == null) {
                System.out.println();
                m++;
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(m == k){
                    System.out.print(currnode.data +" ");
                }
                if(currnode.left != null){
                    q.add(currnode.left);
                }
                if(currnode.right != null){
                    q.add(currnode.right);
                }
            }
        }
    }
    public static void main(String args[]){

         /*        1
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
        // it will print the nodes on the level k
        levelorder(root , 1);

    }
    
}
