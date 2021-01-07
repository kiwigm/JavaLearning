package Demo27.Lambda;

interface Cook {
    void makeFood();
}

public class DemoLambda {
    public static void main(String[] args) {
        // Lambda 表达式
        invokeCook(()->{System.out.println("吃饭啦！");});
    }
    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }

}
