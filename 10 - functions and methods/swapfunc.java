public class swapfunc {

     public static void swap(int a , int b){
        int temp = a;//a value is stored in temp
        a=b;// b value will be stored in a
        b=temp;// a value will be stored in b through temp
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
    public static void main(String args[]){
        int a= 5;
        int b= 10;
        swap(a, b);
        //VALUES WILL BE SWAPED
    }
}
