import java.util.*;
import java.util.LinkedList;
public class interleave4 {
    public static void InterLeave(Queue<Integer> q){
        Queue<Integer> q1 = new LinkedList<>();
        // q1 is firsthalf
        int size = q.size();
        int half = size/2;


        for(int i =0 ; i<half ; i++){
            q1.add(q.remove());
        }
        while(!q1.isEmpty()){
            q.add(q1.remove());
            q.add(q.remove());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i<11 ; i++){
            q.add(i);
        }
        InterLeave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}
