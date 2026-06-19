import java.util.*;
public class prog11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your year");
        int year = sc.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("yes leap year");
                }
                else{
                    System.out.println("not a leap year");
                }

            }
            else{
                System.out.println("leap year");
            }
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
