import java.util.*;
public class HistogramArea {
    public static void MaxArea(int arr[]){
        int maxarea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        //Next Smaller Right
        for (int i = arr.length-1 ; i >= 0; i--){
            while(!s.isEmpty() && arr[i] <= arr[s.peek()] ){/*only this condition is changed */
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }
            else{
                nsr[i] = s.peek();/*top */
            }
            s.push(i);
        }

        //Next smaller left

        s = new Stack<>();
        for (int i = 0 ; i < arr.length; i++){/*now this condition is also changed  */
            while(!s.isEmpty() && arr[i] <= arr[s.peek()] ){/*only this condition is changed */
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();/*top */
            }
            s.push(i);
        }

        // Current area
        // width = j-i-1 = nsr[i]-nsl[i]-1
        for(int i = 0 ;i<arr.length ; i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currarea = height*width;
            maxarea = Math.max(maxarea, currarea);
        }
        System.out.println("maximum area is " + maxarea);
    }
    public static void main(String args[]){
        int arr[] = {2,1,5,6,2,3};
        MaxArea(arr);
    }
}
