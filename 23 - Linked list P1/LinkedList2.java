import java.util.*;
public class LinkedList2 {
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
        //AASSUMING THAT THE LINKED LIST IS EMPTY
        // step 1 create a new node 
        Node newnode = new Node(data);

        if( head == null ){
            head = tail = newnode;
            return;
        }
        //step 2 new node next = head
        newnode.next = head;

        // step 3 head = new node
        head = newnode;
    }

    public void addlast(int data){
        //step 1 creating new node
        Node newnode = new Node(data);
        if( head == null){
            head = tail = newnode;
            return;
        }

        //step 2 tail next = new node 
        tail.next = newnode;
        
        // step 3 new node = tail
        tail = newnode;
    }
    public void print(){
        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        ll.print();
        ll.addfirst(2);
        ll.print();
        ll.addfirst(1);
        ll.print();
        ll.addlast(3);
        ll.print();
        ll.addlast(4);
        ll.print();
    }
}
