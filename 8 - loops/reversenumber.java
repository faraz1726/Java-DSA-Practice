import java.util.*;
public class reversenumber {
    public static void main(String args[]){
        int n =10899;

        while (n>0){
            //modulo is for getting the last digit 
            int lastdigit = n%10;
            //note we have not used println()
            System.out.print(lastdigit);
            //division is for removing the last digit
            n=n/10;
        }
    }
}
