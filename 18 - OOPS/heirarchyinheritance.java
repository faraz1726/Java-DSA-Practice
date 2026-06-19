import java.util.*;
public class heirarchyinheritance {
    public static void main(String[] args) {
       Mammal human = new Mammal();
       human.eat();
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
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}


