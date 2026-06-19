import java.util.*;
public class prog1 {
    public static void main(String args[]){
        int a = 10;
        int b = ++a;
        System.out.println("concept of pre increment");
        System.out.println(a);
        System.out.println(b); 

        int c = 10;
        int d = c++;
        System.out.println("concept of post increment");
        System.out.println(c);
        System.out.println(d); 

        int x=2 , y=5;
        int ex = (x*(y/x));
        System.out.println(ex);
        // answer is 4 because int removes decimal places .
    }
}
