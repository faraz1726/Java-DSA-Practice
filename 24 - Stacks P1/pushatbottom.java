import java.util.*;
public class pushatbottom {
    public static void PushAtBottom(Stack<Integer> s , int m){

        /*using extra memory as array list */
        ArrayList<Integer> list = new ArrayList<>();

        /*removing elements and adding them in array list */
        while(!s.isEmpty()){
            list.add(s.pop());/*[3,2,1] */
        }
         
        /*adding extra number at bottom */
        s.push(m);/*[4] */
        
        for(int i = list.size()-1; i>=0 ; i--){
            s.push(list.get(i));
        }
        /*[4,1,2,3] */
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        /*3
          2
          1
          [1,2,3] */
          
        PushAtBottom(s, 4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
