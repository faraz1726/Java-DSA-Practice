import java.util.*;
public class Queenproblem {
    //NOTE : This problem ignores queen attacking condition, this just tells to place queens in a board.
    public static void nQueen( char board[][] , int row){
        //base case
        if( row == board.length){
            printboard(board);
            return;
        }
        //kaam
        //coloumn loop
        for( int j = 0 ; j < board.length ; j++ ){
            board[row][j] = 'Q';//make queen sit
            nQueen(board, row+1);//fucntion call
            board[row][j] = 'X';//backtracking

        }
    }

    public static void printboard(char board[][]){
        System.err.println("------chess Board------");
        for(int i = 0; i<board.length ; i++){
            for( int j = 0 ; j<board.length ; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];

        //intializing the chess board
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                board[i][j] = 'X';
            } 
        }
        nQueen(board, 0);
        System.err.println(" NOTE : This problem ignores queen attacking condition");
    }
}
