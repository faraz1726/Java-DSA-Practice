
import java.util.*;
public class CircularQueueArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isfull(){
            return (rear+1)%size == front;
        }

        //add
        public static void add(int data){
            if(isfull()){
                System.out.println("Queue is full");
                return;
            }
            // when adding the first element
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        //remove - FIFO
        // removes always the removes the front , means remove elements from the starting
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];

            // when we are deleting the last element
            if(rear == front ){
                rear = front  = -1;
            }
            else{
                front = (front+1)%size;
            }
            return result;
        }

        //peek , mean front , the first element
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        } 

    }
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
