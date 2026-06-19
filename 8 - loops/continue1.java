import java.util.*;
public class continue1 {
    public static void main(String args[]){
         int i;
         for(i=0;i<=5;i++){
            if(i==3){
                //note here we have used println
                System.out.println("iteration is skipped");
                continue;
                
                
            }
            System.out.println(i);
            

         }
    }
}
