public class productfunc {

    public static int product(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        int num1=2;
        int num2=3;
        int answer = product(num1, num2);
        System.out.println("your product is "+answer);
        answer = product(40,20);
        System.out.println("a*b is "+answer);
    }
}
