package Demo05Arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args){
        int[] arr = {2,34,35,4,657,8,69,9};
        String s = Arrays.toString(arr);
        System.out.println(s);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
