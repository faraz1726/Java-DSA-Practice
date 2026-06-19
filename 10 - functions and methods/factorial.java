import java.util.*;
public class factorial {

    public static int factorial(int n){
        int fact =1;
        //it will start multiplying values fron 1 till number ex- 5 , 1*2*3*4*5
        for(int i=1; i<=n ; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    
        System.out.println("your factorial is "+(factorial(num)));

    }
}
