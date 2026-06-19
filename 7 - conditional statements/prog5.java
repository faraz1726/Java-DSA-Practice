import java.util.*;
public class prog5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float income = sc.nextInt();
        float tax ;
        if(income<5){
            tax = 0;
        }
        else if (income>=5 && income<10) {
            tax = income*0.20f;
            
        }
        else{
            tax = income*0.30f;
            
        }
        System.out.println("your tax is : "+tax);

    }
}

