import java.util.*;
public class ActivitySelection {
    
    public static void main(String args[]){
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        
        //making a 2d array , and storing index , start time , end time 
        int activities[][] = new int[start.length][3];/*row, coloumn */
        for(int i = 0 ; i<start.length ; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        // sorting 2d array in java , on the basis of coloum 2 which is end time
        Arrays.sort(activities , Comparator.comparingDouble(o -> o[2]));


        //already sorted on the basis of end time
        int maxmactivity = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //for activity 1 (always selected)
        maxmactivity = 1;
        ans.add(activities[0][0]);// added activity first
        int lastend = activities[0][2];// end time of first activity
        for( int i = 0 ; i<end.length ; i++){
            if(activities[i][1] >= lastend){
                 maxmactivity++;
                 ans.add(activities[i][0]);
                 lastend = activities[i][2];
            }
        }
        System.out.println("maximum activity a person can perform is "+maxmactivity);
        for(int i = 0; i<ans.size() ; i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println(" ");

        
    }
}
