package Demo30.Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class DemoSerializable {
    public static void main(String[] args) {
        Employee e = new Employee("zhangsan", "chaoyang", 20);
        try {
            // 序列化
            FileOutputStream fos = new FileOutputStream("employee.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e);
            oos.close();
            System.out.println("Serialized data is saved");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}

