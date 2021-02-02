package Demo22Exception;

public class DemoCatch {
    public static void main(String[] args) {
        int[] arr = new int[3];
        try {
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            throw new RuntimeException(e);
        }finally {
            System.out.println("不管程序怎样，这里都将会被执行。");
        }
    }
}
