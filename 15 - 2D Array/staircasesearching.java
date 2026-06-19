import java.util.*;
public class staircasesearching {
    /*SEARCHING IN AN SORTED ARRAY */
    public static boolean staircasesearch(int matrix[][] , int key){
        int n = matrix.length , m = matrix[0].length;

        int row = 0 , col = m-1 ;
        /* CASE 1 : FROM TOP LEFT , above condition is saying that we started finding key from
         top left most corner which means from intial row and last coloumn
         */
        while( row < n && col >=0  ){
            if(matrix[row][col]==key){
                System.out.println("key found at ("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row ++;
            }
        }
        System.out.println("key not found");
        return false;

    }
    public static void main(String[] args) {
        
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int n = matrix.length , m = matrix[0].length;

        staircasesearch(matrix,14);

        
    }
}
