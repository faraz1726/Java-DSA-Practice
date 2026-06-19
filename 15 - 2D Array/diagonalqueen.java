import java.util.*;
public class diagonalqueen {

    public static void diagonalfind(int matrix[][]){
        int n = matrix.length , m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row : ");
        int row = sc.nextInt();
        System.out.println("enter coloumn : ");
        int col = sc.nextInt();
        int sum = row + col;
        int diff = row - col;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                if((i+j==sum) || (i-j==diff)){
                    System.out.println("diagonal element "+matrix[i][j]+" at ("+i+","+j+")");
                }
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        int n = matrix.length , m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<n ; i++){/*for row */
            for(int j = 0 ; j<m ; j++){/*for coloumn */
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        diagonalfind(matrix);
        
        
    }
}
