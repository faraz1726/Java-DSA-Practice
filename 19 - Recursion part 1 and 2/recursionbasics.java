import java.util.*;
public class recursionbasics {
    /*print in decreasing order */
    public static void printdec(int n){
        if(n==1){/*base case , it avoids stack overflow */
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");/*intitisal */
        printdec(n-1);/*calling itself and doing some work */
        
    }

    /*print in increasing order */
    public static void printinc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printinc(n-1);
        System.out.println(n + " ");
    }

    /*factorial */
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n*fnm1;
        return fn; 
    }

    /*sum of n natural numbers */
    public static int sum(int n){
        if(n == 1 ){
            return 1;
        }
        int snm1 = sum(n-1);
        int sn = n + snm1;
        return sn; 
    }

    /*print nth fibonacci numbers , considering 0 at 0th position */
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn; 
    }

    /*check if a given array is sorted or not */
    public static boolean issorted( int arr[] , int i){/*i is the starting index */

        if( i == arr.length-1){
            return true;
        }
        if( arr[i] > arr[i+1]){
            return false;
        }
        return issorted(arr , i+1);
        }
    
    /*find the first occurence of an element in an array */
    public static int firstoccur( int arr[] , int key , int i){
        if( i == arr.length){
            return -1;/*key not found */
        }
        if( arr[i] == key){
            return i;
        }
        return firstoccur(arr, key, i+1);
    }

    /*to find the last occurence of an element in an array */
    public static int lastoccur0( int arr[], int key , int i){
        if( i == arr.length){
            return -1;/*key not found */
        }

        int isfound = lastoccur0(arr, key, i+1);/*key found somewehere in the array */
        if(isfound != -1){
            return isfound;
        }
        /*if the above condition becomes false, means isfound == -1, then  */
        if(arr[i] == key){
            return i;/*key found */
        }
        return isfound;
    }
    /*now a more cleaner code for last occurence in an array */
    public static int lastoccur( int arr[], int key , int i){
        if( i == arr.length){
            return -1;
        }
        int isfound = lastoccur(arr, key, i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
    }

    /*calculate X to the power n*/
    public static int power(int x , int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = power( x , n-1);
        int xn = x*xnm1;
        return xn;
    }
    /*optimised power function to calculate X to power n  */
    public static int optimisedpower(int x, int n){
        if(n ==0 ){/*base case */
            return 1;
        }
        
        /*it will be more faster and optimised */
        int halfpower = optimisedpower(x, n/2);
        int halfpowersq =  halfpower * halfpower;

        if( n%2 != 0){/*for odd */
            halfpowersq = x * halfpowersq;
        }
        return halfpowersq;
    }

    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(optimisedpower(2, 5));
    }
}
