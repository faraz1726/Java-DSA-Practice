import java.util.*;
public class reversenumber1 {
    public static void main(String args[]){
        int rev=0;
        int number = 12345;

        while (number>0){
            int lastdigit = number%10;
            rev = ((rev*10) + lastdigit);
            number=number/10;
            
        }
        System.out.print(rev);
    }
}
