import java.util.*;
public class coins {
    public static void main(String args[]){
        //Always use Integer , when sorting in descending order
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins , Comparator.reverseOrder());
        
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        int amount = 1059;

        for(int i = 0 ; i<coins.length ; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){//use the current coin multiple time if it fits
                    count ++;
                    ans.add(coins[i]);
                    amount = amount - coins[i];

                }
            }
        }
        System.out.println("total minimum coins used " + count);
        for(int i = 0 ; i<ans.size() ; i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();

    }
}
