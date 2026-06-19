import java.util.*;
public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}
/*base/parent class */
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breaths");
    }
}
/*derived / child class */
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims");
    }
}
