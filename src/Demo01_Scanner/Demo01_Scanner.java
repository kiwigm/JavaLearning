package Demo01_Scanner;

import java.util.Scanner;
public class Demo01_Scanner {
    public static void main(String[] args) {
        //2. 创建键盘录入数据的对象
        Scanner sc = new Scanner(System.in);
        //3. 接收数据
        System.out.print("请录入一个整数：");
        int i = sc.nextInt();
        //4. 输出数据
        System.out.println("i:"+i);
    }
}
