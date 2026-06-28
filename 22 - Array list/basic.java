import java.util.ArrayList;
public class basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        /*in an array list first element is at 0 index and last is at n-1 index */

        // to add elements in the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1,9); //to store element in a index
         System.out.println(list);

        // to get element
        int element = list.get(3);
        System.out.println(element);

        //to remove element
        list.remove(4);
        System.out.println("list after removing element " + list);

        // set element = it will replace the element in the specified index 
        list.set(2,10);
        System.out.println("list after replacing element at index 2 with 10" + list);

        //contains
        System.out.println(list.contains(3));
        System.out.println(list.contains(4));
       
    }
}
