package Demo25ProducerConsumer;

public class DemoBaoZi {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        Producer p1 = new Producer("包子铺1",bz);
        Consumer c1 = new Consumer("吃货1",bz);
        p1.start();
        c1.start();
        // TODO: 同类线程只能有一个，即一个生产者一个消费者
    }
}
