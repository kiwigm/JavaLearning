package Demo27.Lambda;

interface Calculator{
    int calc(int a,int b);
}

public class DemoLambda3 {
    public static void main(String[] args) {
        invokeCalc(120,130,(int a, int b)->{
            return a+b;
        });
    }
    private static void invokeCalc(int a, int b, Calculator calculator){
        int result = calculator.calc(a,b);
        System.out.println("结果是：" + result);
    }
}
