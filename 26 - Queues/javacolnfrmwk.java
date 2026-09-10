import java.util.*;
import java.util.LinkedList;
/*Note :- Queue is a framework , not a class , so we cannot make objects of queue.
          so for that purpose there are 2 classes that can implement queue i.e
          LinkedList and Arraydeque*/
public class javacolnfrmwk {
    public static void main(String args[]){
        //Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
