package Demo15Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoIterator {
    public static void main(String[] args) {
        // 多态形式创建集合
        Collection<String> collection = new ArrayList<String>();

        // boolean  add(String s) 添加
        collection.add("曹操");
        collection.add("张飞");
        collection.add("关羽");
        System.out.println(collection);

        // 迭代器遍历
        Iterator<String> it = collection.iterator();
        while (it.hasNext()){ // 是否还有元素
            String s = it.next(); // 取出迭代器的元素
            System.out.println(s);
        }

        // 增强for
        for (String s : collection) {
            System.out.println(s);
        }
    }
}