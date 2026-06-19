import java.util.*;
public class consecutivebinarysting {

    public static void printbinstring(int n , int lastplace , String str){
        //base case
        if ( n==0){
            System.out.println(str);
            return ;
        }

    //kaam
    if( lastplace == 0){
        //sit 0 on chair n
        printbinstring(n-1, 0, str+"0");
        //sit 1 on chair
        printbinstring(n-1, 1, str+"1");

    }
    else{
        //only 0 can sit , whem lastplace == 1
        printbinstring(n-1, 0, str+"0");
    }
}
    public static void main(String[] args) {
        printbinstring(3, 0, "");
    }
}

/*last place will tell which will come after it 
if the last place is 0 means after it 0 or 1 can come 
but if the last place if 1 only 0 can come after not 1
last place will tell what will come after it 0 or 1. */