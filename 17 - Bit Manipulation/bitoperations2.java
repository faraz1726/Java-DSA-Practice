import java.util.*;
public class bitoperations2 {

    public static void odd_or_even(int n){
        int bitmask = 1;
        if((n & bitmask) ==  0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }

    public static int get_ith_bit(int n,int i){
        int bitmask = (1<<i);
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int set_ith_bit(int n , int i){
        int bitmask = (1<<i);
        return n | bitmask;
    }

    public static int clear_ith_bit(int n , int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int update1_ith_bit(int n , int i ,int newbit){
        if(newbit == 0){
            return clear_ith_bit(n, i);
        }
        else{
            return set_ith_bit(n, i);
        }
    }

    public static int update2_ith_bit(int n ,int i , int newbit){
        n = clear_ith_bit(n, i);
        int bitmask = (newbit<<i);
        return n | bitmask;
    }

    public static int clear_I_bits(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }

    public static int clear_bits_inrange(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static boolean ispoweroftwo( int n){
        if((n&(n-1))==0){
            return true;
        }
        return false;
    }

    public static int count_set_bits(int n){
        int count = 0;
        while (n>0){
            if((n&1) != 0){ /*checking lsb if it is 0 or 1 , if it is 1 then count++ */
                count ++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastexponentiotion(int a , int n){
        int ans = 1;
        
        while(n > 0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastexponentiotion(3,5));
        
    }
}
