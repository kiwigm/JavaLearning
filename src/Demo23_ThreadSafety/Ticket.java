package Demo23_ThreadSafety;

public class Ticket implements Runnable{
    private int ticketNum = 1000;

    // 同步方法synchronized，线程之间同步
    Object lock = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (lock){
                if (ticketNum >0){
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖：" + ticketNum--);
                }
            }

        }
    }
}
