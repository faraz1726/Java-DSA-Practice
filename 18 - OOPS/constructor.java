import java.util.*;
public class constructor {
    public static void main(String[] args) {
        /*initialisation , only possible with manually created constructors */
        /*NOTE : constructors are called according to the arguments */
        /*s1, s2, s3 are three different objects. */
        Student s1 = new Student();
        Student s2 = new Student("faraz");
        Student s3 = new Student(04011503123);
        
    }
}
/*NOTE : constructors are just functions with same name as of class  */
class Student {
    int rollno;
    String name;

    /*this is called constructor overloading , means a same constructor(function) 
    with either diffn parameters or diffn no.of parameters  */

    /*this is non paramterised constructor */
    Student(){ /*this is the constructor created manually  */
        System.out.println("constructor is called");;
    }
    /*these are parameterised constructors  */
    Student(String name){
        this.name = name;
    }
    /*NOTE : all of them have diffn types of passing arguments, which differentiates b/w them */
    Student(int rollno){
        this.rollno = rollno;
    }
}
