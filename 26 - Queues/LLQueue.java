import java.util.*;
public class LLQueue {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;
        
        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        //add
        public static void add(int data){
            Node newnode = new Node(data);
            //if adding element for the first time
            if( head == null){
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }

        //remove - FIFO
        // removes always the removes the front , means remove elements from the starting
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            // if there is only one element 
            if(tail == head){
                tail = head = null;
            }
            else{
                head = head.next;
            }
            return front;
        }

        //peek , mean front , the first element
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        } 

    }
    public static void main(String args[]){
        Queue q = new Queue();/*no need to pass the size now  */
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
