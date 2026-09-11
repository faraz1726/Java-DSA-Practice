import java.util.*;
public class prime {

    public static boolean Prime_no(int n){
        if(n<1 || n == 1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i = 2 ; i<n ; i++){
            if(n%i==0){
                return  false;
            }
        }
        return true;
    }

    public static void isprime(int n){
        for(int i = 1; i<=n ; i++){
            if(Prime_no(i) == true){
                System.out.println(i);;
            }
        }
    }
    public static void main(String args[]){
        System.out.println(Prime_no(2));
        isprime(11);

    }
}
