import java.util.*;
public class prog9 {
    public static void main(String args[]){
        int a=7 ,b=3;
        Scanner sc = new Scanner (System.in);
        String ch = sc.next();
        switch(ch){
            case "add" : System.out.println(a+b);
                break;
            case "subtract" : System.out.println(a-b);
                break;
            case "multiply" : System.out.println(a*b);
                break;
            case "divide" : System.out.println(a/b);
                break;
            case "modulo" : System.out.println(a%b);
                break;
            default : System.out.println("wrong choice entered");        
        
        }
    }

}
