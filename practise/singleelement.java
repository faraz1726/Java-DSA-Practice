import java.util.*;
public class singleelement {
    public static int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i<n ; i++){
            int count = 0;
            for(int j = 0 ; j<n ; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count == 1){
                return nums[i];
            }
        }
        return -1 ;
        
    }

    public static void main(String[] args) {
        int num[]={1,2,3,4,2,3,4};
        int result = singleNumber(num);
        System.out.println(result);
    }
    
}
