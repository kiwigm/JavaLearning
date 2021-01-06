package Demo15_Generic;

// 2、始终不确定泛型的类型，直到创建对象时，确定泛型的类型
public class MyImp2<E> implements MyGenericInterface<E>{

    @Override
    public void add(E e) {

    }

    @Override
    public E getE() {
        return null;
    }
}
