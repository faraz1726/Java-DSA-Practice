import java.util.*;
public class mergesorting {

    public static void printarr( int arr[]){
        for( int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergesort( int arr[] , int si , int ei){
        //base case

        if(si >= ei){
            return;
        }
        //kaam
        int mid = si + (ei - si)/2;//mid
        mergesort(arr, 0, mid);//left
        mergesort(arr, mid+1, ei);//right
        merge(arr , si, mid , ei);
    }

    public static void merge( int arr[], int si , int mid , int ei){
        //left(0,3), right(4,6) = 7 elemenst -> 6-0 +1 = 7;
        int temp[] = new int[ei - si +1];//temporary array

        int i = si;//left part iterator
        int j = mid+1;//right ietrator
        int k = 0;//temporary array iterator
        while(i <= mid && j <= ei){//comparing elements of left and right array
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;k++;
            }
            else{
                temp[k] = arr[j];
                j++;k++;
            }
        }
        
        //left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy temporary array to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args) {
        int arr[] ={6,3,9,5,2,8,-2};
        mergesort(arr,0, arr.length-1);
        printarr(arr);
    }
}
