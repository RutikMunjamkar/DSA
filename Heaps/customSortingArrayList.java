import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Pair implements Comparable<Pair>{
    int a; int b;
    public Pair(int a, int b){
        this.a=a;
        this.b=b;
    }
    public int compareTo(Pair p){
        //custom sorting
        if(this.b==p.b){
            //if equal then it will sort in the ascending order of a;
            return this.a-p.b;
        }
        //will sort b in the descending order
        return p.b-this.b;
    }
}
public class customSortingArrayList {
    public static void main(String[] args) {
        List<Pair>LL=new ArrayList<>();
        LL.add(new Pair(2,1));
        LL.add(new Pair(3,1));
        LL.add(new Pair(9,10));
        Collections.sort(LL);
        //sorted on the descending order of b and if equal sorted on the ascending order of a
        for(Pair p:LL){
            System.out.println(p.a+" "+p.b);
        }
    }
}
