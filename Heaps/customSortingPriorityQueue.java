import javafx.scene.layout.Priority;

import java.util.Comparator;
import java.util.PriorityQueue;

class Pair1 implements Comparable<Pair1>{
    int a; int b;
    public Pair1(int a, int b){
        this.a=a; this.b=b;
    }
    public int compareTo(Pair1 p){
        if(this.b==p.b){
            return this.a-p.a;
        }
        return p.b-this.b;
    }
}
public class customSortingPriorityQueue {
    public static void main(String[] args) {
        //this is in the case of the custom setting priority
        PriorityQueue<Pair1> pq=new PriorityQueue<>();
        pq.add(new Pair1(2,1));
        pq.add(new Pair1(3,1));
        pq.add(new Pair1(9,10));
        while(!pq.isEmpty()){
            Pair1 p=pq.remove();
            System.out.println(p.a+" "+p.b);
        }
        //if there is single value then use as below
        PriorityQueue<Integer>pq1=new PriorityQueue<>(Comparator.reverseOrder());
    }
}
