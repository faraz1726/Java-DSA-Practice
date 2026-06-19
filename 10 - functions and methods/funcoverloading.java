import java.util.*;
public class funcoverloading {//FUNCTION OVERLOADING USING DIFFERENT NO OF PARAMETERS
    
    //function to add 2 numbers
    public static int sum(int a , int b){
        int sum = a+b;
        return sum;
    }

    //function to add 3 numbers
    public static int sum(int a , int b , int c){
        int sum = a+b+c;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("sum of 2 numbers is "+sum(num1, num2));
        System.out.println("sum of 3 numbers is "+sum(num1, num2, num3));



    }
}
