import java.util.*;
public class abstraction {
    public static void main(String[] args) {

         /*we cannot create a object for abstract classes */

        Horse h1 = new Horse();
        h1.walk();
        h1.eats();
        Duck quack = new Duck();
        quack.walk();
        quack.eats();

       /* whenever we create a object of child class , then first of all the constructor of parent class is called
        color wont change until we called changecolor() of the child class*/

       System.out.println(h1.color);

       Mustang myhorse = new Mustang();
    }
}

abstract class Animal{
    String color;
    Animal(){/*constructor */
        System.out.println("Animal constrcutor called");
    }
    void eats(){/*non abstract function */
        System.out.println("animal eats");
    }
    abstract void walk();/*we cannot define non abstract function */
}

/*class inheriting abstract class , must define their abstract function inside them , here it is walk */
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called");
    }
    void changecolor(){
        color = "golden";
    }
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor is called ");
    }

}
class Duck extends Animal{
    void changecolor(){
        color = "white";
    }
    void walk(){
        System.out.println("duck walks on 2 legs");
    }
}
