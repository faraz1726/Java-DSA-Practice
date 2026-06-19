import java.util.*;
public class constructor2 {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "faraz";
        s1.rollno = 040;
        s1.password = "abcd";
        s1.marks[0] = 30;
        s1.marks[1] = 40;
        s1.marks[2] = 50;

        Student s2 = new Student(s1);/*the object s1 is copied to s2 */
        s2.password = "xyz";
        s1.marks[2] = 100;
        for(int i = 0; i < 3 ; i++){/*therefore the change will not occur in another , because only thr values are copied */
            System.out.println(s2.marks[i]);
        }

        
    }
}

class Student {
    int rollno;
    String name;
    int marks[];/*it is an array so only the reference is copied , so changes in one will occur in another also */
    String password;
    
    /*shallow copy constructor(with only reference , not whole array)  */
    /*Student(Student s1){
        this.name = s1.name;
        this.rollno = s1.rollno;
        marks = new int[3];
        this.marks = s1.marks;
    }*/

    /*deep copy constructor with values copied not reference */
    Student(Student s1){
        this.name = s1.name;
        this.rollno = s1.rollno;
        marks = new int[3];
        for(int i = 0 ; i<marks.length ; i++){
            this.marks[i] = s1.marks[i];
        } 
    }

   
    Student(){ 
        System.out.println("constructor is called");
        marks = new int[3];
    }
    
    Student(String name){
        this.name = name;
        marks = new int[3];
    }
    
    Student(int rollno){
        this.rollno = rollno;
        marks = new int[3];
    }

}
