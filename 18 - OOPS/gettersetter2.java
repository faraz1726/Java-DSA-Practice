import java.util.*;
public class gettersetter2 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.set_color("blue");
        System.out.println(p1.get_color());/*now we can access them , using the functions
                                             defined inside the class*/

        p1.set_tip(5);
        System.out.println(p1.get_tip());/*we can access them */

        p1.set_color("yellow");;/*we can access them */
        System.out.println(p1.get_color());
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
    /*NOTE : (this) keyword is majorily helpfull when paramter 
     * has same name as original parameter.
     */
    /*this is a setter function */
    void set_tip(int tip){/*this tip is a external variable */
        this.tip = tip;/*this.tip refers to the original old value */
    }
    void set_color(String newclr){
        this.color = newclr;
    }


}
