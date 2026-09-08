import java.util.*;
public class ValidParentheses {

    public static boolean isvalid(String str){
        Stack<Character> s = new Stack<>();
        
        for(int i = 0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            //opening
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            //closing
            else{
                // for those condition in which there is only closing brackets , so stack will be empty
                if(s.isEmpty()){
                    return false;
                }
                else{
                    char top = s.peek();
                    if(top == '(' && ch ==')' ||
                    top =='{' && ch =='}' ||
                    top =='[' && ch == ']'){
                        s.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        
        }
        return s.isEmpty();
    }
    public static void main(String args[]){
        String str = "({})[]";
        if(isvalid(str)){
            System.out.println("Valid Parentheses");
        }
        else{
            System.out.println("Invalid Parentheses");
        }
    }
}
