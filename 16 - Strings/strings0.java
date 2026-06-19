import java.util.*;
public class strings0 {

    public static void printletters(String str){
        for( int i = 0; i<str.length() ; i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        String str = new String("faraz ahmed");
        String str1 = "faraz ahmed ";
        System.out.println(str);
        System.out.println(str1);

        Scanner sc = new Scanner(System.in);
        System.out.print("enter your string : ");
        String str2 = sc.nextLine();
        
        System.out.println(str2 + " str 2 is printed");
    

        int length = str2.length();
        System.out.println("length of "+str2+" is "+length);

        String firstname = "faraz ahmed";
        String lastname = "qureshi";
        String fullname = firstname + " " + lastname;
        printletters(fullname);
    }
}
