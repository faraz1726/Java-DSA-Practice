import java.util.*;
public class jobsequencing {
    //created a class
    static class job{
        int deadline;
        int profit;
        int id;
        //constructor of the class
        public job(int i, int d , int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String args[]){
        int jobsinfo[][] = {{4,20} ,{1,10} ,{1,40} ,{1,30}};
        
        // jobs is the object of the class , which stores id , deadline and profits of different jobs
        ArrayList<job> jobs = new ArrayList<>();
        for(int i = 0 ; i<jobsinfo.length ; i++){
            jobs.add(new job( i , jobsinfo[i][0] , jobsinfo[i][1]));
        }
        
        // objects sorting in descending order on the basis of profit , 
        // if want to do in ascending order than obj1.profit - obj2.profit
        Collections.sort(jobs , (obj1,obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time  = 0;
        for(int i =0 ; i<jobs.size() ; i++){
            job current  = jobs.get(i);
            if(current.deadline > time){
                seq.add(current.id);
                time++;
            }

        }
        System.out.println("maximum jobs which we can do is " + seq.size());
        for(int i = 0 ; i<seq.size() ;i++){
            System.out.print(seq.get(i) + " ");
        }
    }
}
