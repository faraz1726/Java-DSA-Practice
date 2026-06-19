import java.util.*;
public class compresstring {
    public static String string_compression(String str){
        String newstr = "";
        for(int i = 0 ; i<str.length() ; i++){
            Integer count = 1;
            /*string follow 0 base indexing as same as arrays , suppose the length(n) is 5 so
             indexing will be ,0,1,2,3,4 , 3 is less than n-1 and 4 is less than n.
             */
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count > 1){
                newstr += count.toString();
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(string_compression(str));

    }
}
