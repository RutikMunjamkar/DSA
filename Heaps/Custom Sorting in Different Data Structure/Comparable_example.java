import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age, String name){
        this.age=age;
        this.name=name;
    }
    public int compareTo(Student s){
//        if(s.name.compareTo(this.name)==0){
//            return 0;
//        }
//        else if(s.name.compareTo(this.name)<0){
//            return 1;
//        }
        return s.name.compareTo(this.name);
    }
}
public class Comparable_example {
    public static void main(String[]args){
        List<Student> list=new ArrayList<>();
        list.add(new Student(4,"rutik"));
        list.add(new Student(1,"sharad"));
        Collections.sort(list);
        for(Student s:list){
            System.out.println(s.age+" "+s.name);
        }
    }
}
