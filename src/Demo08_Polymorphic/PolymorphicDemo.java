package Demo08_Polymorphic;

abstract class Animal{
    public abstract void eat();
}

class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("吃鱼");
    }
    public void catchMouse() {
        System.out.println("抓老鼠");
    }

}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("吃骨头");
    }
    public void watchHouse() {
        System.out.println("看家");
    }
}

public class PolymorphicDemo {
    public static void showCatEat(Cat c){
        c.eat();
    }
    public static void showDogEat(Dog d){
        d.eat();
    }
    public static void showAnimalEat(Animal a){
        a.eat();
    }

    public static void main(String[] args){
        Cat c = new Cat();
        Dog d = new Dog();
        showCatEat(c);
        showDogEat(d);

        // 用showAnimalEat()一个方法代替
        Animal a1 = new Cat();
        Animal a2 = new Dog();
        showAnimalEat(a1);
        showAnimalEat(a2);

        Cat c1 = (Cat)a1;
        c1.catchMouse();
    }
}
