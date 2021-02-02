package Demo23Thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i++);
        }
    }
}

