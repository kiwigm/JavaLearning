package Demo10_RedPacket;

import java.util.ArrayList;

public class Common implements OpenMode{
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int money = totalMoney / totalCount;
        for (int i = 0;i<totalCount - 1;i++){
            list.add(money);
            totalMoney -= money;
        }
        list.add(totalMoney);
        System.out.println("普通红包金额:" + list);
        return list;
    }
}
