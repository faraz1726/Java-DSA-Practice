import java.util.*;
public class StackB {
    static class Stack{

        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isempty(){
            return list.size() == 0;/*if size = 0 , it will return true , otherwise false */
        }

        //Push 
        public static void push(int data){
            list.add(data);
        } 

        //Pop
        public static int pop(){/*it will store the deleted element and reurn it also */
            if(isempty()){/*means stack is empty */
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        } 

        //Peek
        public static int peek(){
            if(isempty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isempty()){/*while stack is not empty */
            System.out.println(s.peek());
            s.pop();
        }
    }
}
