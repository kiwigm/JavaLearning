package Demo33UploadFile;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUploadServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器，启动...");
        ServerSocket ss = new ServerSocket(6666);
        // 每次接收新的连接,创建一个Socket
        while (true){
            Socket server = ss.accept();

            // socket对象交给子线程处理,进行读写操作
            new Thread(() -> {
                try {
                    // 输入流读取文件
                    BufferedInputStream bis = new BufferedInputStream(server.getInputStream());
                    // 创建数据流，保存到本地
                    FileOutputStream fos = new FileOutputStream(System.currentTimeMillis()+".jpg");
                    BufferedOutputStream bos = new BufferedOutputStream(fos);

                    byte[] b = new byte[1024 * 8];
                    int len;
                    while ((len = bis.read(b)) != -1) {
                        bos.write(b, 0, len);
                    }


                    // =====信息回写=====
                    System.out.println("<Server>文件上传成功！back ...");
                    OutputStream out = server.getOutputStream();
                    out.write("<Server>上传成功！".getBytes());
                    out.close();
                    // =================

                    bos.close();
                    bis.close();
                    server.close();
//                    System.out.println("<Server>文件上传成功！");
                }catch (IOException e){
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
