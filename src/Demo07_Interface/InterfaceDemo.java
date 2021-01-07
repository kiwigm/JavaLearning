package Demo07_Interface;

interface LiveAble {
    public abstract void eat();
    public abstract void sleep();
}


class Animal implements LiveAble {
    public void eat(){
        System.out.println("吃东西");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}

public class InterfaceDemo {
    public static void main(String[] args){
        Animal a = new Animal();
        a.eat();
        a.sleep();
    }
}
