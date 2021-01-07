package Demo26Thread.ProducerConsumerSemaphore;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public class Storage {

    // 仓库存储的载体
    private LinkedList<Object> list = new LinkedList<Object>();
    // 仓库的最大容量
    final Semaphore empty = new Semaphore(10);  // 开始空位置个数
    // 将线程挂起，等待其他来触发
    final Semaphore full = new Semaphore(0); // 开始满位置个数
    // 互斥锁
    final Semaphore mutex = new Semaphore(1);

    public void produce()
    {
        try {
            empty.acquire();//顺序不能颠倒，否则会造成死锁。
            mutex.acquire();
            list.add(new Object());
            System.out.println("【生产者" + Thread.currentThread().getName()
                    + "】生产一个产品，现库存" + list.size());
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            mutex.release();
            full.release();
        }
    }

    public void consume()
    {
        try {
            full.acquire();//顺序不能颠倒，否则会造成死锁。
            mutex.acquire();
            list.remove();
            System.out.println("【消费者" + Thread.currentThread().getName()
                    + "】消费一个产品，现库存" + list.size());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            mutex.release();
            empty.release();
        }
    }
}
