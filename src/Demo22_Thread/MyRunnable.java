package Demo22_Thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (true){
            System.out.println(Thread.currentThread().getName()+" "+i++);
        }
    }
}

