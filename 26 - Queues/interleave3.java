import java.util.*;
import java.util.LinkedList;
public class interleave3 {
    public static void InterLeave(Queue<Integer> q){
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        int size = q.size();
        int half = size/2;


        for(int i =0 ; i<half ; i++){
            q1.add(q.peek());
            q.remove();
        }
        for(int j = half ; j<size ; j++){
            q2.add(q.peek());
            q.remove();
        }

        int top;
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
            top = q2.remove() ;
            q2.add(top);
        }
        while(!q2.isEmpty()){
            System.out.print(q2.peek() +" ");
            q2.remove();
        }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i<11 ; i++){
            q.add(i);
        }
        InterLeave(q);
    }
}
