import java.util.*;
public class interfaces {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();

        Student s1 = new Student();
        s1.schoolname = "SMDS";
        Student s2 = new Student();
        System.out.println(s2.schoolname);/*it will print SMDS becoz static is common for all objects in a class */
        /*static are made and defined once in the memory , when we changes its values ,it will applied to all objects. */
        Student s3 = new Student();
        s3.schoolname = "APS DK";
        System.out.println(s1.schoolname);/*value for s1 and s2 all get changed */
        System.out.println(s2.schoolname);

        System.out.println(s3.return_percentage(20, 20, 20));

        Horse h1 = new Horse();
        System.out.println(h1.color);/*we have not defined color variable in horse , still it wont giver error */
    }
}
/*SUPER KEYWORD */
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal{
    
    Horse(){
        super.color = "brown";/*it will call the constructor of Animal , which is Animal itself */
        System.out.println("Horse contructor is called");
    }
}
/*STATIC KEYWORD */
class Student{
    static int return_percentage(int maths , int phy , int chem){
        return (maths + phy + chem)/3;
    }
    String name ;
    int rollno ;

    static String schoolname;

    void setname(String name){
        this.name = name;
    }

    String getname(){
        return this.name;
    }
}
/*INTERFACES */
interface Chess{
    void moves();
}
class Queen implements Chess{
    public void moves(){
        System.out.println("up , down , left , right , deiagonal , in all dirn");
    }
}
class roook implements Chess{
    public void moves(){
        System.out.println("up , down , left , right ");
    }
}
class king implements Chess{
    public void moves(){
        System.out.println("up , down , left , right by one step");
    }
}
