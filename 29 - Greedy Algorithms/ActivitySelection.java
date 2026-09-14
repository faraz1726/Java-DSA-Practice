import java.util.*;
public class ActivitySelection {
    
    public static void main(String args[]){
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};

        //sorting on end time
        int maxmactivity = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //for activity 1 (always selected)
        maxmactivity = 1;
        ans.add(0);// added ectivity first
        int lastend = end[0];// end time of first activity
        for( int i = 0 ; i<end.length ; i++){
            if(start[i] >= lastend){
                 maxmactivity++;
                 ans.add(i);
                 lastend = end[i];
            }
        }
        System.out.println("maximum activity a person can perform is "+maxmactivity);
        for(int i = 0; i<ans.size() ; i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println(" ");

        
    }
}
