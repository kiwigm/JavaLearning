package Demo07Interface;

interface A{
    public abstract void showA();
    public abstract void show();
}

interface B{
    public abstract void showB();
    public abstract void show();
}

class c implements A,B{
    @Override
    public void showA(){
        System.out.println("showA");
    }
    @Override
    public void showB(){
        System.out.println("showB");
    }
    @Override
    public void show(){
        System.out.println("show");
    }
}

public class MultiInterface {
}
