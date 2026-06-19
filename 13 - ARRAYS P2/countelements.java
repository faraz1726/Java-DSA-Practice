import java.util.*;
public class countelements{

    public static boolean countduplicate(int numbers[] ,int key){
        for(int i = 0; i<numbers.length ; i++){
            for(int j = i+1 ; j<numbers.length ; j++){
                if(numbers[i]==numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,2,8};
        boolean result = countduplicate(numbers, 2);
        System.out.println(result);
    }
}