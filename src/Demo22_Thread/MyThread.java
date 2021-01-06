package Demo22_Thread;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
//        for (int i = 0; i < 10; i++) {
//            System.out.println(getName() + "：正在执行！" + i);
//        }
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() +getId()+ "：正在执行！" + i++);
        }
    }

}
