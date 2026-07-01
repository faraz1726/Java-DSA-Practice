import java.util.*;
public class LinkedList3 {
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

    public void addfist(int data){
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
            head  = tail = newnode;
            return;
        }
        tail.next = newnode;
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

    public void add(int idx , int element){
        Node newnode = new Node(element);
        Node temp = head;
        int i = 0;
        while( i < (idx-1)){
            temp = temp.next;
            i++;
        }
        //when  i = idx-1 , means temp->prev 
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public static void main(String[] args) {
        LinkedList3 ll  =new LinkedList3();
        ll.print();
        ll.addfist(2);
        ll.print();
        ll.addfist(1);
        ll.print();
        ll.addlast(3);
        ll.print();
        ll.addlast(4);
        ll.print();
        ll.add(2, 9);
        ll.print();
        
    }
}
