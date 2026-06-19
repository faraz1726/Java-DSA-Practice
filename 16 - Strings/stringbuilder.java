import java.util.*;
public class stringbuilder {
    public static void main(String[] args) {
        /*intialised with empty string */
        StringBuilder sb =  new StringBuilder("");
        for(char ch='a' ; ch<='z' ; ch++){
            sb.append(ch);
            /*time complexity using append is O(n) ....good */
            /*but if use sb += ch , then it will be O(n*n)....bad */
        }
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.toString());
        /*this toString() function will only work with
         objects and classes like ex:- Integer, character,
         not with int , char .....etc .
         */

         Integer a = 10;
         System.out.println(a.toString());
    }
}
