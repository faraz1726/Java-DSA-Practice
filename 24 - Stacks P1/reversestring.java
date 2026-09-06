import java.util.*;
public class reversestring {

    public static void ReverseString(String str){
        /*str = abc */
        Stack<Character> s = new Stack<>();
        for (int i = 0  ; i<str.length(); i++){
            s.push(str.charAt(i));
        }

        String reverse = "";
        while(!s.isEmpty()){
            reverse = reverse + s.pop();
        }
        System.out.println(reverse);
        
    }
    public static void main(String args[]){
        ReverseString("abc");
    }
}
