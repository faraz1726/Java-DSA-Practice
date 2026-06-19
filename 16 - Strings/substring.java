import java.util.*;
public class substring {
    /*user defined function */
    public static String find_substring(String str ,int si , int ei){
        String substr = "";
        for(int i = si ; i<ei ; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "helloworld";
        System.out.println(find_substring(str, 0, 5));
        
        /*JAVA DEFINED FUNCTION */
        System.out.println(str.substring(0, 5));
    }
}
