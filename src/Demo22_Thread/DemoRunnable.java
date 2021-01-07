package Demo22_Thread;

public class DemoRunnable {

    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread th1 = new Thread(mr,"th1");
        Thread th2 = new Thread(mr,"th2");
        th1.start();
        th2.start();
    }
}
