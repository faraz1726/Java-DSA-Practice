import java.util.*;
import java.util.LinkedList;
public class interleave {
    public static void InterLeave(int[] arr){
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Queue<Integer> q3 = new LinkedList<>();
        int size = arr.length;
        int half = size/2;


        for(int i =0 ; i<half ; i++){
            q1.add(arr[i]);
        }
        for(int j = half ; j<size ; j++){
            q2.add(arr[j]);
        }
        while(!q1.isEmpty() && !q2.isEmpty()){
            q3.add(q1.peek());
            q3.add(q2.peek());
            //System.out.print(q1.peek() + " "+ q2.peek() + " ");
            q1.remove();
            q2.remove();
        }
        
        while(!q3.isEmpty()){
            System.out.print(q3.peek() + " ");
            q3.remove();
        }
    }
    public static void main(String args[]){
        int[] arr  = {1,2,3,4,5,6,7,8,9,10};
        InterLeave(arr);
    }
}
