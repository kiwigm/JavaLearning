package Demo22Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoThrows {
    public static void main(String[] args) throws IOException{
        read("a.txt");
    }
    public static void read(String path) throws FileNotFoundException, IOException {
        if("a.txt".equals(path)){
            throw new FileNotFoundException("文件不存在");
        }
        if ("b.txt".equals(path)){
            throw new IOException();
        }
    }
}
