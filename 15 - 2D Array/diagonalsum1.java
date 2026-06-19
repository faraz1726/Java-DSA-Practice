import java.util.*;
public class diagonalsum1 {
    /*OPTIMISED CODE */
    public static int diogonal_sum(int matrix[][]){
        int n = matrix.length , m = matrix[0].length;
        int sum = 0;
        for(int i = 0 ; i<n ; i++){
            sum =  sum + matrix[i][i];/*condition for primary diagon i = j */
            int j = n-i-1;/*condn for secondary diagonal where i+j = n-1 */
            if(i != j){/*this make sure that common element in both diagonal is not repeated */
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int n = matrix.length , m = matrix[0].length;

        int result = diogonal_sum(matrix);
        System.out.println(result);
    }
}
