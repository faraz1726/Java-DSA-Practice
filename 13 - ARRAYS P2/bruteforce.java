import java.util.*;
public class bruteforce {

    public static void maxsubarraysum(int numbers[]){
        
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length ; i++){
            int start =i;
            for(int j=i; j<numbers.length ; j++){
                int end=j;

                currsum = 0;
                for(int k=start ; k<=end ;k++){
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }   
            } 
        }
        System.out.println("maximum sum is : "+maxsum);
    }
    
    public static void main(String[] args){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        maxsubarraysum(numbers);
    }
}
