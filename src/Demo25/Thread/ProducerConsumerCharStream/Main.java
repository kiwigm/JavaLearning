package Demo25.Thread.ProducerConsumerCharStream;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Producer p = new Producer();
        Consumer c = new Consumer();
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        try {
            p.getPipedWriter().connect(c.getPipedReader());
            t2.start();
            t1.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
