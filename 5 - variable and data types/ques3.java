import java.util.*;
public class ques3 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a+b+c;
        double e = d+d*0.18f;
        System.out.print("total of 3 products without gst is : ");
        System.out.println(d);
        System.out.print("total of 3 products with gst is: ");
        System.out.println(e);

    }
}
