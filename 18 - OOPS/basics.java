import java.util.*;
public class basics{
    /*the execution of a program will always starts from main function */
    public static void main(String[] args) {
        /*Pen() is the constructor which is created by default / automatically */
        /*otherwise we can also create a constructor with name as of class, manually inside the class Pen */
        Pen p1 = new Pen();/*p1 is the object of class Pen */
        /*using dot(.) operator to call function */
        p1.set_color("blue");
        /*using dot(.) operator to retrieve value */
        System.out.println(p1.color);

        p1.set_tip(5);
        System.out.println(p1.tip);

        p1.set_color("red");
        System.out.println(p1.color);

        Bankaccount myacc = new Bankaccount();
        /*see here we can access username as it is public but not password */
        myacc.username = "faraz";
        /*note here we can just set password, but still cannot access it */
        myacc.Setpassword("abcdefgh");

    }
    
}

class Bankaccount{
    public String username;
    private String password;
    /*this function can access password becoz its within the class  */
    public void Setpassword(String pwd){
        password = pwd;
    }
    
}


/*note : always start class name with capital letter */
class Pen{
    String color;
    int tip;

    void set_color(String newcolor){
        color = newcolor;
    }

    void set_tip(int newtip){
        tip = newtip;
    }
}

class Student {
    String name ;
    int age;
    float percentage;

    void calcpercentage(int phy , int chem , int maths){
        percentage = (phy + chem + maths)/3;
    }
}