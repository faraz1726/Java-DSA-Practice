import java.util.*;
public class maxHeap {
    //MAXIMUM HEAP 
    static class heap{
        ArrayList<Integer> arr = new ArrayList<>();
        //add at last
        public void add(int data){
            arr.add(data);

            //child index
            int x = arr.size()-1;
            //parent index
            int par = (x-1)/2;

            //sign reversed here for maximum heap
            while(arr.get(x) > arr.get(par)){
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par , temp);

                x = par;
                par = (x-1)/2;

            }
        }
        //root node or 0th index element is the minimum element in a min heap
        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i+1;//index of left node
            int right = 2*i+2;// index of right node
            //here we have assumed that the heap is not disturbed while removing thr node
            //still the root is the minimum value , having min index
            int minidx = i;// asssumed that the root is having the min value index

            //COMPARING LEFT AND RIGHT NODE WITH ROOT NODE AND SWAPPING THEM IF THEY ARE SMALLER
            //if left node is smaller than the root node
            if(left < arr.size() && arr.get(minidx) > arr.get(left)){
                minidx = left;
            }
            //if right node is smaller than the root node
            if(right < arr.size() && arr.get(minidx) > arr.get(right)){
                minidx = right;
            }
            //when the heap is disturbed , and the root is not having the min value
            if(minidx != i){
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx ,temp);
                //similarly to set other nodes as well
                heapify(minidx);
            }
        }
        public int remove(){
            int data = arr.get(0);

            //step 1 - swap first and last
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step 2 - delete last
            arr.remove(arr.size()-1);

            //step 3 - heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
        
    }
    public static void main(String[] args) {
        heap h = new heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
