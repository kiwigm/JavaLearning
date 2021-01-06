package Demo30.Serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeserializable {
    public static void main(String[] args) {
        Employee e = null;
        try {
            FileInputStream fis = new FileInputStream("employee.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            e = (Employee) ois.readObject();
            System.out.println(e);
            ois.close();
            fis.close();
        }catch (IOException i){
            i.printStackTrace();
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }
    }
}
