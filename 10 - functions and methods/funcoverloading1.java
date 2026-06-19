import java.util.*;
public class funcoverloading1 {//FUNCTION OVERLOADING USING DIFFERENT types OF PARAMETERS
    
    //function to add int numbers
    public static int sum(int a , int b){
        return a+b;
    }

    //function to add float numbers
    public static float sum(float a , float b){
        return a+b;
    }
    public static void main(String args[]){
        
        System.out.println("sum of int numbers is "+sum(4,5));
        System.out.println("sum of float numbers is "+sum(4.1f,5.1f));//need to declare f.



    }
}
