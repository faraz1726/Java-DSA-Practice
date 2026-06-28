import java.util.*;
public class twodarraylist2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int k = 1; k<=5 ; k++){
            list1.add(k*1);
            list2.add(k*2);
            list3.add(k*3);
        }

        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println("this is main list  " + mainlist);

        for(int i = 0 ; i<mainlist.size() ; i++){
            ArrayList<Integer> currlist = mainlist.get(i);
            for(int j = 0 ; j<currlist.size() ; j++){
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }

    }
}
