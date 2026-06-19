import java.util.*;
public class bsearch {

    public static int binarysearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){/*right case */
                start = mid +1;
            }
            else{/*left case */
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9};
        int key = 7;
        System.out.println("index is "+binarysearch(numbers, key));
    }
}
