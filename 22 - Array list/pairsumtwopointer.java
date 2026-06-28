import java.util.*;
public class pairsumtwopointer {
    // IN AN SORTED ARRAY
    //by two pointer
    public static boolean pairsum1(ArrayList<Integer> list , int target){
        int lp = 0;
        int rp = list.size()-1;
        while(rp>lp){ // or you can use lp!=rp , this condition is also true
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            else if( list.get(lp) + list.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
        }  
        return false;      
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pairsum1(list, target));
        
    }
}
