import java.util.*;
public class MaxSubArraySum {

    public static void subarraysum(int numbers[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0 ; i<numbers.length ; i++){
            int start = i;
            for(int j  = 1 ; j<numbers.length ; j++){
                int end = j;
                currsum = 0;
                for(int k = start ; k<=end ; k++){
                    currsum += numbers[k];
                    System.out.println(currsum);
                }
                if(currsum > maxsum){
                        maxsum = currsum;
                }
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String args[]){
        int[] numbers = {1,2,3,4,5};
        subarraysum(numbers);

    }
}
