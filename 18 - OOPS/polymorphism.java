import java.util.*;
public class polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        /*FUNCTION OVERLOADING */
        /*this is compile time polymorphism because before
         execution it knows which function to call */
         System.out.println(calc.sum(3,4));
         System.out.println(calc.sum(3,4,5 ));
         System.out.println(calc.sum((float)3.1,(float) 4.5,(float)2.2));

         /*FUNCTION OVERRIDING */
         Deer d1 = new Deer();
         d1.eat();/*it will print what is acc. to child class  */
    }
}

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}


class Calculator{
    int sum(int a , int b){
        return a+b;
    }
    float sum(float a ,float b , float c){
        return a+b+c;
    }
    int sum ( int a, int b, int c){
        return a+b+c;
    }
}
