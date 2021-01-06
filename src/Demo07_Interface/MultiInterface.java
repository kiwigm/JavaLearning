package Demo07_Interface;

interface A{
    public abstract void showA();
    public abstract void show();
}

interface B{
    public abstract void showB();
    public abstract void show();
}

class c implements A,B{
    public void showA(){
        System.out.println("showA");
    }
    public void showB(){
        System.out.println("showB");
    }
    public void show(){
        System.out.println("show");
    }
}

public class MultiInterface {
}
