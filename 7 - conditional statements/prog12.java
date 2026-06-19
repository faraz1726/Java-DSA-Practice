import java.util.*;
public class prog12 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number 1");
        int a = sc.nextInt();
        System.out.println("enter nnumber 2");
        int b = sc.nextInt();
        System.out.println("enter your choice +-*/%");
        char ch = sc.next().charAt(0);
        switch(ch){
            case '+' : System.out.println(a+b);
                break;
            case '-' : System.out.println(a-b);
                break;
            case '*' : System.out.println(a*b);
                break;
            case '/' : System.out.println(a/b);
                break;
            case '%' : System.out.println(a%b);
                break;
            default : System.out.println("wrong choice entered");        
        
        }
    }

}
