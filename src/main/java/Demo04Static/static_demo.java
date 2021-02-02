package Demo04Static;

class Student {

    private int id;
    private String name;
    private int score;
    int age;
    static int idCounter = 0;

    Student() {
        setId(++idCounter);
    }

    // 构造函数
    Student(String name, int score) {
        setId(++idCounter);
        setName(name);
        setScore(score);
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void setScore(int score) {
        this.score = score;
    }

    int getScore() {
        return score;
    }

    static void printInfo() {
        System.out.println("yes!");
//        System.out.println(age);

    }

    void printInfo2() {
        printInfo();
        System.out.println(age);
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("kiwi", 90);
        System.out.println("s1 id:" + s1.getId() + " name:" + s1.getName() + " score:" + s1.getScore());
        System.out.println("s2 id:" + s2.getId() + " name:" + s2.getName() + " score:" + s2.getScore());
        Student.printInfo();
        s1.printInfo2();
        System.out.println(Student.idCounter);
    }
}