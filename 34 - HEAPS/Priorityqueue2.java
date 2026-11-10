import java.util.PriorityQueue;
public class Priorityqueue2 {
    /*
    There is no inbuilt logic for classes to compare their objects , now Comparable keyword
    gives classes the power to compare their objects based on name (alphabetical order) or rank.
    comparable is the interface.
    
    when a function presents in parent class and then the chils class uses or implements that 
    function this is called overriding
    */
    static class student implements Comparable<student>{
        String name ;
        int rank;

        public student(String name , int rank){
            this.name = name;
            this.rank  = rank;
        }

        /*Synatx for comparing objects */
        @Override 
        public int compareTo(student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<student> stu = new PriorityQueue<>();
        stu.add(new student("A", 4));
        stu.add(new student("B", 5));
        stu.add(new student("C", 2));
        stu.add(new student("D", 12));

        while(!stu.isEmpty()){
            System.out.println(stu.peek().name +"->"+stu.peek().rank);
            stu.remove();
        }


    }
}
