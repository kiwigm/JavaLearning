package Demo11Object;

import java.util.Objects;

public class DemoObject {
    public static void main(String[] args){
        Person p1 = new Person("Jack",20);
        Person p2 = new Person("Tom",20);
        Person p3 = new Person("Jack",20);
        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

        //
        System.out.println(Objects.equals(p1,p2));
    }
}
