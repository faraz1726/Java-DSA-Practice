import java.util.*;
//SIZE OF LARGEST BST IN A BT
public class LargestBST {

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

    static class info{
        boolean isbst;
        int size;
        int min;
        int max;

        info(boolean isbst , int size , int min , int max){
            this.isbst = isbst;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static void main(String[] args){
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        /*
                  50
                /    \
              30      60
             /  \    /  \
            5   20  45   70
                         /  \
                        65   80

                 given BT
        */


    }
}
