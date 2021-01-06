package Demo29.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoCharStream {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("a.txt");
        int len;
        byte[] b = new byte[2];
        while ((len = fis.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }
        fis.close();

    }
}
