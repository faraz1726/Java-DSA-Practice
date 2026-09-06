import java.util.*;
public class pushatbottom2 {
 
    /*empty → put data. Otherwise → remove top → recursively go to bottom → put top back. */
    /*Keep removing the top element until the stack becomes empty. Then put 4 there. 
    After that, put all the removed elements back. */
    
    public static void PushAtBottom(Stack<Integer> s , int data){
        while(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        PushAtBottom( s , 4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
