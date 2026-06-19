import java.util.*;
public class Permutation {
    public static void findpermutation( String str , String ans){
        //base case
        if(str.length()  == 0){
            System.out.println(ans);
            return;
        }
        //kaam(recursion)
        for( int i = 0 ; i<str.length() ; i++){
            char curr = str.charAt(i);
            //abcde we want to remove c then "ab"+"de" = "abde"
            String NewStr = str.substring(0, i) + str.substring(i+1);
            /*in the first substring i is exclusive , and in the 2nd substring
               we started elements from i+1 till the length of the string , so 
               i is not considered and removed, and in the second substring no  
               need to specify the last index , it is by default 
               by manually it is str.length()-1; */
            findpermutation(NewStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        findpermutation("abc", "");
        
    }
}
