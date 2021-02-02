package Demo23Thread;

public class DemoThread extends Thread {

    public static void main(String[] args) {

        MyThread th1 = new MyThread("<子线程1>");
        MyThread th2 = new MyThread("<子线程2>");
        th1.start();
        th2.start();

    }
}
