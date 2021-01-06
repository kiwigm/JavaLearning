package Demo23_ThreadSafety;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket2 implements Runnable{
    private int ticketNum = 1000;

    // 定义锁，线程之间同步
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
                lock.lock();
                if (ticketNum >0){
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖：" + ticketNum--);
                }
                lock.unlock();
        }
    }

}