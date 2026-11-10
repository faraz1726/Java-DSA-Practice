import java.util.*;
public class InsertInheap {

    static class heap{
        ArrayList<Integer> arr = new ArrayList<>();
        //add at last
        public void add(int data){
            arr.add(data);

            //child index
            int x = arr.size()-1;
            //parent index
            int par = (x-1)/2;

            //till child value is less than parents value 
            //because in min heap parent value is less than child value
            while(arr.get(x) < arr.get(par)){
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par , temp);
            }
        }
        
    }
    public static void main(String[] args) {
        
    }
}
