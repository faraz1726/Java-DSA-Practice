import java.util.PriorityQueue;
public class Priorityqueue2 {
    /*
    There is no inbuilt logic for classes to compare their objects , now Comparable keyword
    gives classes the power to compare their objects based on name (alphabetical order) or rank
    
    when a function presents in parent class and then the chils class uses or implements that 
    function this is called overriding*/
    static class student implements Comparable<student>{
        String name ;
        int rank;

        public student(String name , int rank){
            this.name = name;
            this.rank  = rank;
        }
    }
    public static void main(String args[]){

    }
}
