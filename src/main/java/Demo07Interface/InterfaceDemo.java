package Demo07Interface;

interface LiveAble {
    void eat();
    public abstract void sleep();
}


class Animal implements LiveAble {
    @Override
    public void eat(){
        System.out.println("吃东西");
    }
    @Override
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
