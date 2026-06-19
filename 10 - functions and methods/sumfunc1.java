import java.util.*;
public class sumfunc1 {
    
    public static void calculatesum(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("your sum is " + sum );
    }

    public static void main(String args[]){
        calculatesum();
    }
}
