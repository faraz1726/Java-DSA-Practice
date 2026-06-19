import java.util.*;
public class breakeyword1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int number= sc.nextInt();

        
        while(number>0){
            if(number%10 == 0 ){
                System.out.print("i am out of the loop");
                break;
                
            }
            System.out.print("enter a number : ");
            number= sc.nextInt();
            System.out.println(number);
        }

    }
}
