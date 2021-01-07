package Demo32.UploadFile;

import java.io.*;
import java.net.Socket;

public class FileUploadClient {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("01_input.jpg"));
        Socket client = new Socket("localhost",6666);
        BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());

        byte[] b = new byte[1024 * 8];
        int len;
        while ((len = bis.read(b))!= -1){
            bos.write(b,0,len);
            bos.flush();
        }
        System.out.println("<Client>文件发送完毕！");
        client.shutdownOutput();

        // =====解析回写=====
        InputStream is = client.getInputStream();
        byte[] back = new byte[20];
        is.read(back);
        System.out.println(new String(back));
        is.close();
        // ================

        bos.close();
        client.close();
        bis.close();
    }
}
