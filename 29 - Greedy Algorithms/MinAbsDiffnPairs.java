import java.util.*;
public class MinAbsDiffnPairs {
    public static void main(String args[]){
        int A[] ={4,1,8,7};
        int B[] ={2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);

        int n = A.length;
        int diff = 0;
        for( int i = 0; i<n ;i++){
            diff += Math.abs(A[i]-B[i]);
            
        }
        System.out.println(diff);
    }
}
