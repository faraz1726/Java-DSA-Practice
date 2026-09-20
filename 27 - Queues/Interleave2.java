import java.util.*;
import java.util.LinkedList;
public class Interleave2 {
    public static void InterLeave(int[] arr){
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        int size = arr.length;
        int half = size/2;


        for(int i =0 ; i<half ; i++){
            q1.add(arr[i]);
        }
        for(int j = half ; j<size ; j++){
            q2.add(arr[j]);
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
        int[] arr  = {1,2,3,4,5,6,7,8,9,10};
        InterLeave(arr);
    }
}
