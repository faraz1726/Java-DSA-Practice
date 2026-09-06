import java.util.*;
public class reversestring {

    public static void ReverseString(String str){
        /*str = abc */
        /*first add characters to stack */
        Stack<Character> s = new Stack<>();
        for (int i = 0  ; i<str.length(); i++){
            s.push(str.charAt(i));
        }
        /*than reverse the stack  */
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
