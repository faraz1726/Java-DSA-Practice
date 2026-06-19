import java.util.*;
public class prog4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float income = sc.nextInt();
        if(income<5){
            System.out.println("you income tax is zero");
        }
        else if (income>=5 && income<10) {
            float tax = income*0.20f;
            System.out.println("tax on your income is 20% , which is "+ tax);
        }
        else{
            float tax2 = income*0.30f;
            System.out.println("tax on income is 30%"+tax2);
        }

    }
}
