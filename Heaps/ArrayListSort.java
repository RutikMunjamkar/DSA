import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {
        //ArrayList
        List<Integer> list=new ArrayList<>();
        //AscendingOrder
        Collections.sort(list);
        //DescendingOrder
        Collections.sort(list,Collections.reverseOrder());

        //ArrayList<ArrayList>
        List<List<Integer>>LL=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();List<Integer> list2=new ArrayList<>();
        list1.add(12);list1.add(4);list1.add(7);
        list2.add(1);list2.add(3);list2.add(8);
        LL.add(list1);
        LL.add(list2);
//        Collections.sort(LL, Comparator.comparingInt(list3->list3.get(0)));
//        comparing is used to compare the strings, comparingLong,comparingDouble is used for the long and double
//        Collections.sort(LL,Comparator.comparing(list->(String)(list.get(1))));
        System.out.println(LL);
    }
}
