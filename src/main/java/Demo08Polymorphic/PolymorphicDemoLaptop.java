package Demo08Polymorphic;

interface USB {
    void open();

    void close();
}


class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标开启，红灯闪一闪");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭，红灯熄灭");
    }

    public void click() {
        System.out.println("鼠标点击");
    }
}

class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("键盘开启，绿灯闪一闪");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭，绿灯熄灭");
    }

    public void knock() {
        System.out.println("键盘打字");
    }
}

class Laptop {
    public void run() {
        System.out.println("笔记本运行");
    }

    public void useUSB(USB usb) {
        if (usb != null) {
            usb.open();
            if (usb instanceof Mouse) {
                // 向下转型
                Mouse m = (Mouse) usb;
                m.click();
            } else if (usb instanceof Keyboard) {
                Keyboard k = (Keyboard) usb;
                k.knock();
            }
            usb.close();
        }
    }

    public void shutDown() {
        System.out.println("笔记本关闭");
    }
}

public class PolymorphicDemoLaptop {
    public static void main(String[] args) {
        Laptop L = new Laptop();
        L.run();
        USB u = new Mouse();
        L.useUSB(u);

        Keyboard kb = new Keyboard();
        L.useUSB(kb);

        L.shutDown();
    }
}
