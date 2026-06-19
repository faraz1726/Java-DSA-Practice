import java.util.*;
public class gettersetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.set_color("blue");
        System.out.println(p1.color);/*we cannot access them directly as , they are private
                                        because of which we are getting an error */

        p1.set_tip(5);
        System.out.println(p1.tip);/*we cannot access them */

        p1.color = "yellow";/*we cannot access them */
        System.out.println(p1.color);
    }
}

class Pen{
    /*these properties are private , only the functions 
    inside the class can access them  */

    private int tip;
    private String color;
    /*this is a getter funciton */
    String get_color(){
        return this.color;
    }
    int get_tip(){
        return this.tip;
    }

    /*this is a setter function */
    void set_tip(int tip){/*this tip is a external variable */
        this.tip = tip;/*this.tip refers to the original old value */
    }
    void set_color(String newclr){
        this.color = newclr;
    }


}
