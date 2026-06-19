import java.util.*;
public class getlargest {
    public static int get_largest(int matrix[][]){
        int n = matrix.length , m = matrix[0].length;
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                if(largest < matrix[i][j]){
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = 3 , m = 3;
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        /*for printing / output */
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    int result = get_largest(matrix);
    System.out.println("largest number in matrix is "+result);
    }
}
