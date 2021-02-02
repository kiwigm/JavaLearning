package Demo20StudentsSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("rose",18));
        list.add(new Student("jack",20));
        list.add(new Student("abc",19));
        list.add(new Student("ace",17));
        list.add(new Student("mark",16));
        System.out.println(list);

        Comparator<Student> cmp = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Collections.sort(list,cmp);
        System.out.println(list);

        for (Student once:list){
            for (Student once1:list){
                System.out.println(once.compareTo(once1));
            }
        }
    }
}
