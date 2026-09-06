import java.util.*;
public class ReverseStack {

    public static void reversestack(Stack<Integer> s){
        Stack<Integer> m = new Stack<>();
        while(!s.isEmpty()){
            m.push(s.pop());
            System.out.println(m.peek());
        }
        
       
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reversestack(s);
    

    }
}
