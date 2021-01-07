package Demo24.ProducerConsumer;

public class Producer extends Thread{
    private BaoZi bz;
    public Producer(String name,BaoZi bz){
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true){
            synchronized (bz){
                if (bz.flag == true){
                    try{
                        bz.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                if (count%2 == 0){
                    bz.pier = "普通";
                    bz.xianer = "麻辣豆腐";
                }else {
                    bz.pier = "冰皮";
                    bz.xianer = "生煎";
                }
                count ++;
                bz.flag = true;
                System.out.println("<Producer>包子造好了："+bz.pier+bz.xianer+"吃货来吃吧!");
                bz.notify();
            }
        }
    }
}
