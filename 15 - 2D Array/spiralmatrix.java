import java.util.*;
public class spiralmatrix {

    public static void spiral_matrix(int matrix[][]){
        int n = matrix.length ; /*no.of rows */
        int m = matrix[0].length;/*no.of coloumns */

        int startrow = 0;
        int startcolomn = 0;
        int endrow = n-1;
        int endcolomn = m-1;

        while(startrow<=endrow && startcolomn<=endcolomn){
            /*top */
            for(int j = startcolomn ; j<=endcolomn ;j++){
                System.out.print(matrix[startrow][j] + " ");
            }

            /*right */
            for(int i = startrow+1; i<=endrow ; i++){
                System.out.print(matrix[i][endcolomn] + " ");
            }

            /*bottom */
            for(int j = endcolomn-1 ; j>=startcolomn ; j--){
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");

            }

            /*left */
            for(int i = endrow-1 ; i>=startrow+1 ;i--){
                if(startcolomn == endcolomn){
                    break;
                }
                System.out.print(matrix[i][startcolomn] + " ");
            }

            /*update the variables */
            startcolomn++;
            startrow++;
            endcolomn--;
            endrow--;
            
        }

        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        spiral_matrix(matrix);
    }
}
