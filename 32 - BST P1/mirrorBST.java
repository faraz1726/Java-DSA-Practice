
import java.util.*;
public class mirrorBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String args[]){
    /*
                            8
                         /     \
                        5      10
                      /   \     \
                     3     6     11
    
    */


/*
 
                      8      
                    /    \  
                   10     5      
                   /   /   \    
                  11   3     6     
*/
Node root =  new Node(8);
root.left = new Node(5);
root.right = new Node(10);
root.left.left = new Node(3);
root.left.right = new Node(6);
root.right.right = new Node(11);
}
}
