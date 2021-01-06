package Demo30.Serializable;

public class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int age; // 瞬态成员不会序列化

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void addressCheck() {
        System.out.println("Address check : " + name + " ‐‐ " + address);
    }
}
