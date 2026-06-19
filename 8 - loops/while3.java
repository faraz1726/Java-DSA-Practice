import java.util.*;
public class while3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int number = sc.nextInt();
        int sum =0;
        int i =1;
        while(i<=number){
            sum=sum+i;
            i++;
            
        }
        System.out.println("sum of numbers is "+sum);

    }
}
