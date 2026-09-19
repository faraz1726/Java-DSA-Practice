import java.util.*;
public class fractionknapsack {
    public static void main(String args[]){
        int weight[] = {10,20,30};
        int value[] = {60,100,120};
        int capacity = 50;
        int val = 0;/*this is the value added in the bag */
        int ratio[] = new int[3];
        /*ration will be [6,5,4] */
        for(int i = 0 ; i<value.length ; i++){
            ratio[i] = value[i]/weight[i];
        }

        int n = value.length;
        /*so thats why we are iterating forward */
        for(int i = 0 ; i< n ;i++){
            if(capacity >= weight[i]){
                capacity = capacity - weight[i];
                val = val + value[i];
            }
            else{
                val = val + ratio[i]*capacity;
            }
        }
        System.out.println(val);

    }
}
