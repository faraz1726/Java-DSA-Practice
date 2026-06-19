public class swapfunc1 {

    public static void swap(int a , int b){
        int temp = a;//a value is stored in temp
        a=b;// b value will be stored in a
        b=temp;// a value will be stored in b through temp
    }
    public static void main(String args[]){
        int a= 5;
        int b= 10;
        swap(a, b);
        //NOW THE VALUES WILL NOT BE SWAPED, BECAUSE IT IS CALL BY VALUE 
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        
    }
}
