import java.util.*;
public class array1 {

    int nonchangebale = 10;

    // this is a good example of call by refernce
    public static void update(int mark[]){
        for(int i=0; i<mark.length ; i++ ){
            mark[i] = mark[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={25,26,27,28,29};

        update(marks);

        int nonchangebale = 5;/*this is call by value */
        //after calling this function the marks are updated , now print them
        for(int i=0 ; i<marks.length ; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println(nonchangebale);

    }
}
