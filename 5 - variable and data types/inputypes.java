
import java.util.*;
public class inputypes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //taking input as whole line
        String name = sc.nextLine();
        System.out.println(name);

        //taking input for single word
        String str = sc.next();
        System.out.println(str);

        //taking input for integer
        int input =sc.nextInt();
        System.out.println(input);
         
        //taking input for float number 
        float number =sc.nextFloat();
        System.out.println(number);

    }
    
}

