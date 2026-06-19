import java.util.*;
public class while1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int number = sc.nextInt();
        int counter = 1;
        while(counter <= (number)){
            System.out.println(counter);
            counter++;
        }

    }
}
