import java.util.*;
public class array0 {
    public static void main(String[] args) {
        
        int marks[] = new int[50];

        int number[]={1,2,3};

        String name[]={"faraz","nishtha","manish"};

        System.out.println(name[0]);
        System.out.println(number[2]);
        System.out.println(marks.length);

        //input and output of array

        Scanner sc = new Scanner(System.in);
        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();

        System.out.println("phy = "+marks[0]);
        System.out.println("maths = "+marks[1]);
        System.out.println("chem = "+marks[2]);

        marks[2]= 97;//updated marks 

        int percentage = ( marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage is "+percentage+"%");

        System.out.println("chem updated marks = "+marks[2]);
    }
}
