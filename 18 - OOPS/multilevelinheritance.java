import java.util.*;
public class multilevelinheritance {
    public static void main(String[] args) {
        Dogs dobby = new Dogs();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breaths");
    }
}

class Mammal extends Animal{
    int legs;
}
class Dogs extends Mammal{
    String breed;
}
