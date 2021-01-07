package Demo18_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoComparator {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("a2r");
        list.add("b1q");
        list.add("c4p");
        list.add("d3o");

        // 定义Comparator，重写compare方法
        Comparator<String> cp= new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(2) - o2.charAt(2);
            }
        };
        // 根据cp对list排序
        Collections.sort(list);

        System.out.println(list);
    }
}
