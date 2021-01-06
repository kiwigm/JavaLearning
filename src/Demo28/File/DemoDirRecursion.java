package Demo28.File;

import java.io.File;

public class DemoDirRecursion {
    public static void main(String[] args) {
        File dir = new File("./");
        System.out.println(dir.getAbsolutePath());
        printDir(dir);
    }
    public static void printDir(File dir){
        File[] files = dir.listFiles();

        for (File file:files){
            if (file.isFile()){
                if (file.getName().endsWith("java")){
                    System.out.println("文件："+ file.getAbsolutePath());
                }
            }else {
//                System.out.println("目录" + file.getAbsolutePath());
                printDir(file);
            }
        }
    }

}
