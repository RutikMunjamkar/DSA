import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

where a=is this.x and b=p.x;
Data Type   | Ascending Order                | Descending Order
------------|--------------------------------|-------------------------------
int         | a - b or Integer.compare(a,b)  | b - a or Integer.compare(b,a)
long        | Long.compare(a,b)              | Long.compare(b,a)
double      | Double.compare(a,b)            | Double.compare(b,a)
float       | Float.compare(a,b)             | Float.compare(b,a)
String      | str1.compareTo(str2)           | str2.compareTo(str1)

Note: - String sorts on the basis of Ascii values/ lexicographically 
Ex: - Zebra comes first the abc becuase 'Z' has lower ascii tha 'a'


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

