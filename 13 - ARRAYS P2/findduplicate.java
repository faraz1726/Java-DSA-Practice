import java.util.*;
public class findduplicate {

    public static int duplicate(int numbers[]){
        int n = numbers.length;
        for(int i = 0; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(numbers[i]==numbers[j]){
                    return numbers[i];
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,2,4,3,5};
        int result = duplicate(numbers);
        System.out.println(result);
    }
}
