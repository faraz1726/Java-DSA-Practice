import java.util.*;
public class NextGreater2 {
    public static void main(String args[]){
        int[] arr = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int[] nextgreater = new int[arr.length];

        for(int i = arr.length-1 ; i>=0 ; i-- ){/*we are iterating from backwards */
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextgreater[i] = -1;
            }
            else{
                nextgreater[i] = arr[s.peek()];/*s.peek gives the index , but we need the value of element */
            }
        s.push(i);/*we are storing index of elements in stack */
        }

        for(int i = 0 ; i<nextgreater.length ; i++){
            System.out.print(nextgreater[i] + " " );
        }   

    }
}
