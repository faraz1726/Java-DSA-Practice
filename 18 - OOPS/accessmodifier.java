import java.util.*;
public class accessmodifier {/*this is what we called ENCAPSULATION means access modifiers */
    public static void main(String[] args) {
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
    public void Setpassword(String pwd){/*this is a setter */
        password = pwd;
    }
    
}