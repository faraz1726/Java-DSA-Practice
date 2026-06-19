import java.util.*;
public class tilingproblem {

    public static int tilingproblm( int n){
        /*base case */
        if( n==0 || n==1){
            return 1;
        }

        /*vertical case or choice */
        int fnm1 = tilingproblm(n-1);

        /*horizontal case or choice*/
        int fnm2 = tilingproblm(n-2);

        /*total ways */
        int totalways = fnm1 + fnm2;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(tilingproblm(3));
    }
}
