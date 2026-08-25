import java.util.*;
public class ArrayPalindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array");
        int n = sc.nextInt();

        int[] arr= new int[n];
        System.out.println("enter elements");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        boolean flag = true;
        for(int i = 0 ; i<n/2 ; i++){
            if(arr[i] != arr[n-1-i] ){
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println("array is palindrome");
        }
        else{
            System.out.println("array is not a palindrome");
        }
    }
}