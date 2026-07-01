import java.util.*;
public class LinkedList1 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addfirst(int data){
        //ASSUMING THAT THE LINKED LIST CONTAINS MULTIPLE NODES

        // step 1 create a new node 
        Node newnode = new Node(data);

        // step 2 new node next = head 
        newnode.next = head;

        //step 3 head = new node
        head = newnode;
    }

    public void addlast(int data){
        //step 1 creating new node
        Node newnode = new Node(data);

        //step 2 tail next = new node 
        tail.next = newnode;

        // step 3 new node = tail
        tail = newnode;
    }
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
    }
}
