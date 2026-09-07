import java.util.*;
public class nextgreater {
    public static void main(String args[]){

        int arr[] = {6,8,0,1,3};
        int result[] = new int[arr.length];

        for(int i  = 0; i<arr.length ; i++){
            boolean found = false;
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[j] > arr[i]){
                    result[i] = arr[j];
                    found = true;
                    break;
                }
            }
            if(found == false){
                result[i] = -1;
            }
        }

        for(int i = 0 ; i<result.length ; i++){
            System.out.print(result[i] + " ");
        }
    }
}
