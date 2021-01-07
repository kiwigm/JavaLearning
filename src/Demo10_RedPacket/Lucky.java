package Demo10_RedPacket;

import java.util.ArrayList;
import java.util.Random;

public class Lucky implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        // 创建保存各个红包金额的集合
        ArrayList<Integer> list = new ArrayList<>();
        // 定义循环次数,总个数‐1次
        int time = totalCount - 1;
        // 创建随机数对象
        Random random = new Random();
        for (int i = 0; i < time; i++) {
            /*
             * 每次重新计算,生成随机金额
             * 随机范围: totalMoney / count * 2,totalMoney不断的减少,
             * count也不断的减少,所以这是一个可变化的范围.
             */
            int money = random.nextInt(totalMoney / totalCount * 2) + 1;
            // 金额添加到集合
            list.add(money);
            // 总金额扣除已分配金额
            totalMoney-=money;
            // 红包个数‐1
            totalCount--;
        }
            // 剩余的金额,为最后一个红包
        list.add(totalMoney);
        return list;
    }
}
