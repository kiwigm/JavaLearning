package Demo10RedPacket;

public class RedPacketTest {
    public static void main(String[] args) {
        RedPacket rp = new RedPacket("大红包");
        rp.setOwnerName("我是群大大");
//        rp.setOpenWay(new Common());
        rp.setOpenWay(new Lucky()); // 手气红包
    }
}