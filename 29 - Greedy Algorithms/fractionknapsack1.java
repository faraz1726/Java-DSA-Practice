import java.util.*;
public class fractionknapsack1 {
    public static void main(String args[]){
        int weight[] = {10,20,30};
        int value[] = {60,100,120};
        int capacity = 50;
        int val = 0;/*this is the value added in the bag */
        
        /*sorting in ascending order o the basis of ratio with storing index , ratio */
        double ratio[][] = new double[weight.length][2];
        for(int i = 0 ; i<value.length ; i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i]; 
        }
        Arrays.sort(ratio , Comparator.comparingDouble(o -> o[1]));

        int n = value.length;
        /*so thats why we are iterating forward */
        for(int i = n-1 ; i>= 0 ;i--){
            int index = (int)ratio[i][0];
            if(capacity >= weight[index]){
                capacity = capacity - weight[index];
                val = val + value[index];
            }
            else{
                val += (ratio[i][1]*capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println(val);

    }
}
