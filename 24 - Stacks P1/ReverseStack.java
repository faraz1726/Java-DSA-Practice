import java.util.*;
public class ReverseStack {

    public static void reversestack(Stack<Integer> s){
        Stack<Integer> m = new Stack<>();
        while(!s.isEmpty()){
            m.push(s.pop());
            System.out.println(m.peek());
        }
        /*in this s becomes empty and m has elements  */
    }


    public static void reversestack1(Stack<Integer> s){
        Stack<Integer> m = new Stack<>();
        while(!s.isEmpty()){
            m.push(s.pop());
        }

        while(!m.isEmpty()){
            s.push(m.pop());
        }  
    }
    /*in this the original stack s is not empty now */


    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reversestack1(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    

    }
}
