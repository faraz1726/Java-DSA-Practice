import java.util.*;
public class getlargest {

    public static int get_largest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0 ; i<numbers.length ; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest value is "+smallest);//becoz func can return only one thing
        return largest;
    }
  public static void main(String[] args) {
    int numbers[]={2,3,5,6,7,83,98,45,55};
    System.out.println("largest number is "+get_largest(numbers));
  }  
}
