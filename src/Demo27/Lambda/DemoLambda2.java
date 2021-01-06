package Demo27.Lambda;

import java.util.Arrays;
import java.util.Comparator;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class DemoLambda2 {
    public static void main(String[] args) {
        // 年龄乱序的对象数组
        Person[] array = {
                new Person("古力娜扎", 19),
                new Person("迪丽热巴", 18),
                new Person("马尔扎哈", 20) };
//        // 匿名内部类
//        Comparator<Person> comp = new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        };
//        Arrays.sort(array, comp); // 第二个参数为排序规则，即Comparator接口实例
//        for (Person person : array) {
//            System.out.println(person);
//        }

        // Lambda 写法
        Arrays.sort(array, (Person o1, Person o2)->{return o1.getAge() - o2.getAge();}); // 第二个参数为排序规则，即Comparator接口实例
        for (Person person : array) {
            System.out.println(person);
        }
    }
}
