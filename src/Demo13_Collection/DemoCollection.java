package Demo13_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class DemoCollection {
    public static void main(String[] args){
        // 多态形式创建集合
        Collection<String> collection = new ArrayList<String>();

        // boolean  add(String s) 添加
        collection.add("曹操");
        collection.add("张飞");
        collection.add("关羽");
        System.out.println(collection);

        // boolean contains(E e)是否存在
        System.out.println(collection.contains("张飞")); // true

        // boolean remove(E e) 删除在集合中的o元素
        collection.remove("张飞");

        // size() 集合中有几个元素
        System.out.println(collection.size());

        // Object[] toArray()转换成一个Object数组
        Object[] objects = collection.toArray();
        // 遍历
        for (int i = 0;i<objects.length;i++){
            System.out.println(objects[i]);
        }

        // void clear() 清空集合
        collection.clear();
        // boolean  isEmpty()  判断是否为空
        System.out.println(collection.isEmpty());
    }
}
