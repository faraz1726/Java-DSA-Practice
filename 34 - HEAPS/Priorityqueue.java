import  java.util.PriorityQueue;
public class Priorityqueue {

    //In priority queue the integer having lowest value will have highest priority
    //queue works on FIFO but PQ works on priority
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
