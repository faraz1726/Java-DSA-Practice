import java.util.*;
public class pattern1{
    public static void alphabetpattern(){
        char ch = 'A';
        for( int i = 1 ; i<=5 ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }


    public static void numpatter(int n){
        for( int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void reversepattern(){
        
        for(int line=1;line<=4;line++){
            for(int star=4;star>=line;star--){
                System.out.print(star +" ");
            }
            System.out.println();
            
        }
    }
    public static void main(String args[]){
        numpatter(3);
        alphabetpattern();
        reversepattern();

    }
}