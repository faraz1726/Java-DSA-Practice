import java.util.*;
public class linkedlist {
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
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addlast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print(){
        if(head == null){
            System.out.println("linked list is empty");
        }
        Node temp = head;
        while( temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public void add(int idx, int data){
        Node newnode = new Node(data);
        Node temp = head;
        int i =0;
        while(i<idx-1){
            i++;
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public static void main(String args[]){
        linkedlist ll = new linkedlist();
        ll.print();
        ll.addfirst(2);
        ll.print();
        ll.addfirst(1);
        ll.print();
        ll.addlast(4);
        ll.print();
        ll.addlast(5);
        ll.print();
        ll.add(2,3);
        ll.print();

    }
}
