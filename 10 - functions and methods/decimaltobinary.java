import java.util.*;
public class decimaltobinary {

    public static void dectobin(int n){
    int pow=0;
    int bin =0;
    int mynnum = n;

    while(n>0){
        int rem = n%2;
        bin = bin + rem*(int)Math.pow(10, pow);
        pow++;
        n = n/2;
    }
    System.out.println("binary number for : "+mynnum+ " is : "+bin);
    }
    public static void main(String args[]){
    
           dectobin(8);
    }
}
