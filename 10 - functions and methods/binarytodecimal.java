import java.util.*;
public class binarytodecimal {

    public static void bintodec(int binum){
        int pow = 0;
        int dec = 0;
        int binumber = binum;
        while(binum>0){
            int lastdigit = binum%10;
            dec = dec + (lastdigit*(int)(Math.pow(2,pow)));
            pow++;
            binum=binum/10;
    }
    System.out.println(dec+" is the decimal number for "+binumber);
}
    public static void main(String args[]){
        bintodec(101);
        }
    
}
