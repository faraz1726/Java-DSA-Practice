import java.util.*;
public class diagonalsum {

    public static int diogonal_sum(int matrix[][]){
        int n = matrix.length , m = matrix[0].length;
        int sum = 0;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
            
                if(i==j){/*conditon for primary diagonal */
                    sum = sum + matrix[i][j];
                }
                else if( i+j == n-1){/*condition for secondary diagonal */
                    sum = sum + matrix[i][j];
                }
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
