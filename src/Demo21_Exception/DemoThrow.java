package Demo21_Exception;

public class DemoThrow {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int idx = -1;
        if (idx<0){
            throw new  ArrayIndexOutOfBoundsException("越界");
        }

    }
}
