package Demo06Extends;

class Animal {
    int id;

    Animal() {
        id = 0;
        System.out.println("Animal");
    }

}

class Dog extends Animal {
    int id;

    Dog() {
        id = 10;
        System.out.println("Dog");
    }

    public void show() {
        System.out.println("Animal:" + super.id);

        System.out.println("Dog:" + this.id);
    }
}

public class ExtendsDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
//        d.show();
    }
}
