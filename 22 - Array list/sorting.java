import java.util.*;
public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        Collections.sort(list);/*in ascending order */
        System.out.println("after sorting " + list);
        Collections.sort(list , Collections.reverseOrder());/*in descending or reverse order */
        System.out.println("in descending order" + list);
    }
    
}
