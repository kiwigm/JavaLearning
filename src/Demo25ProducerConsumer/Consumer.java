package Demo25ProducerConsumer;

public class Consumer extends Thread{
    private BaoZi bz;
    public Consumer(String name, BaoZi bz){
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if (bz.flag == false){
                    try {
                        bz.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("<Consumer>"+Thread.currentThread().getName()+"正在吃"+bz.pier+bz.xianer+"包子");
                try {
                    sleep(1000); // 吃包子时间
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = false;
                bz.notify();
            }
        }
    }
}
