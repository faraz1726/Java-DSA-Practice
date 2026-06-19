import java.util.Arrays;
import java.util.Collections;
public class predefinedsorting {
    public static void printarray(Integer arr[]){
        for(int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    /*NOTE : reverse order funciton works on object so we have to change int to Integer */
    /*otherwise it will giver us error */
    public static void main(String[] args) {
        Integer arr[]={5,4,1,3,2};
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printarray(arr);


    }
}
