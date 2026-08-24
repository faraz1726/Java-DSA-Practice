import java.util.*;

public class prime1toN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number : ");
        int number = sc.nextInt();

        for(int i = 2; i <= number; i++) {
            int flag = 0;

            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println(i);
            }
        }
    }
}