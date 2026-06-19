import java.util.*;
public class majorityelement {

    public static int majority(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            int count = 0;
            int n = arr.length/2;
            for(int j = 0 ; j<arr.length ; j++){
                if(arr[i]==arr[j]){
                    count++;
                }   
            }
            if(count > n){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr[]={2,1,2,4,2,2,2,2,2,2,2,2};
        int result = majority(arr);
        System.out.println(result);

    }
}
