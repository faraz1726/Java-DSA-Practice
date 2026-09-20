import java.util.*;
public class DuplicateParentheses {

    public static boolean isduplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i =0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            //opeing , operands , operators 
            /*push the elements untill closing brackets are not found */
            if(ch != ')'){
                s.push(ch);
            }
            else{
                int count = 0;/*it created every time in else loop */
                /*delete the elements in the stack untill opening brackets ( are not found  */
                while(s.peek() !='('){
                    s.pop();
                    count ++;
                }
            
                s.pop();
                /*it will remove the opening brackets ( if found */
                if(count == 0){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        // string given be valid string 
        String str = "((a+b))";
        if(isduplicate(str)){
            System.out.println("Duplicate Parentheses");
        }
        else{
            System.out.println("not duplicate parentheses");
        }
    }
}
/* when the string is ((a+b)), inside the while loop count will be 3 , after poping 
    b ,+ , a , the it encounter ( , pop outside the while loop removes it , than 
    again else loop will run and now we have count = 0 again , but this time 
    while loop womt run , because the condition of while turns out to be false . */
