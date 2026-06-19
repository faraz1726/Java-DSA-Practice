import java.util.*;
public class rotatedarraysearch {
    public static int search(int numbers[] , int key){
        int n = numbers.length;
        int start = 0 , end =n-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }

            if(numbers[start]<=numbers[mid]){
                if(key>=numbers[start]  && key<numbers[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }

            }
            else{
                if(key>numbers[mid] && key<=numbers[end]){
                    start = mid +1;
                }
                else{
                    end = mid -1;
                }
            }

        }
        
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {4,5,6,7,0,1,2};
        int key = 0;
        int index = search(numbers, key);
        System.out.println(index);
    }

}

    

