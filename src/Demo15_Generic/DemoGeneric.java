package Demo15_Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoGeneric {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("abc");
        coll.add("def");
//        coll.add(5);//由于集合没有做任何限定，任何类型都可以给其中存放
        Iterator it = coll.iterator();
        while(it.hasNext()){
            //需要打印每个字符串的长度,就要把迭代出来的对象转成String类型
            String str = (String) it.next();
            System.out.println(str.length());
        }

        // 含有泛型的类
        MyGenericClass<String> myGenericClass = new MyGenericClass<String>();
        myGenericClass.setMvp("yes");
        String mvp = myGenericClass.getMvp();
        System.out.println(mvp);
        //创建一个泛型为Integer的类
        MyGenericClass<Integer> my2 = new MyGenericClass<Integer>();
        my2.setMvp(123);
        Integer mvp2 = my2.getMvp();

        // 含有泛型的方法
        MyGenericMethod m = new MyGenericMethod();
        m.show("dog");
        m.show(2);
        m.show(12.3);

        // 含有泛型的接口，第二种方式
        MyImp2<String> mi = new MyImp2<String>();
        mi.getE();
    }
}
