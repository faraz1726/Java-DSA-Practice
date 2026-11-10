import java.util.*;
public class InsertInheap {

    static class heap{
        ArrayList<Integer> arr = new ArrayList<>();
        //add at last
        public void add(int data){
            arr.add(data);
        }
        //child index
        int chidx = arr.size()-1;
        //parent index
        int pdx = (chidx-1)/2;
    }
    public static void main(String[] args) {
        
    }
}
