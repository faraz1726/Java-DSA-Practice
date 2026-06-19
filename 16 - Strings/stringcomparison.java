import java.util.*;
public class stringcomparison {
    public static void main(String[] args) {
        
        String s1 = "tony";/*s1 and s2 both refer to the same strings */
        String s2 = "tony";
        String s3 = new String("tony");/*new creates a new space in the memory */
        /*main method / funcation to compare the values of strings */
        if(s1.equals(s3)){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are unequal");
        }
        
        if(s1==s2){
            System.out.println("strings s1 and s2 are equal ");
        }
        else{
            System.out.println("strings are unequal");
        }

        if(s1==s3){
            System.out.println("strings s1 and s3 are equal ");
        }
        else{
            System.out.println("strings are unequal");
        }


    }
}
