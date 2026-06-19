import java.util.*;
public class continue2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int number = sc.nextInt();

        while (number >0){
            System.out.print("enter a number : ");
            number = sc.nextInt();
            if(number%10==0){
                continue;
            }
           
            System.out.println(number);
        }
    }
}
