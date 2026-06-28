import java.util.*;
public class reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        System.out.println(list.size());
        /*in an array list first element is at 0 index and last is at n-1 index */

        for(int i = list.size()-1 ; i>=0 ; i--){/*because index will i = 0,1,2,3,4*/
            System.out.print(list.get(i) + " ");
        }
    }
    
}
