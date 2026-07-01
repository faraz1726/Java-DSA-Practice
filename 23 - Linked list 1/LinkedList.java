import java.util.*;
public class LinkedList {
    public static class Node{ // this is the class Node.
        int data;         // it tells that a single node contains data and a pointer next to the other node.
        Node next;        // next is a variable that stores the address of another Node.

                               // IMPORTANT : constructor must have same name as of the class 
        public Node(int data){ // this is the constructor of the code Node .
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        
    }
    
}
