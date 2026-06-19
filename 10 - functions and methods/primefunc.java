import java.util.*;
public class primefunc {

    public static void prime(double n){
        int flag =0;
        int i;
        
        if( n < 1){
            flag = 1;
        }
        else{
            for(i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1){
            System.out.println("not a prime number");
        }
        else{
            System.out.println("a prime number");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        double number = sc.nextDouble();
        prime(number);
        
    }

}
