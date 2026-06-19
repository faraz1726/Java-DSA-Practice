import java.util.*;
public class binomial {
// this is function 1 for factorial
    public static int factorial(int n){
        int fact =1;
        for(int i=1; i<=n ; i++){
            fact = fact*i;
        }
        return fact;
    }
// this is function 2 for binomial coefficient
    public static int bincoeffi(int a , int b){
        int nfact = factorial(a);
        int rfact = factorial(b);
        int nmrfact = factorial(a-b);
        int binomial=(nfact)/(rfact*nmrfact);
        return binomial;
    }
// this is main function for calling all the functions    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("your binomial coefficient is "+(bincoeffi(num1, num2)));

    }
}
