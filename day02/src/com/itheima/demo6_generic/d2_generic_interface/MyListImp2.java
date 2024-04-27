package com.itheima.demo6_generic.d2_generic_interface;

// 实现类: 实现接口的时候不指定接口泛型的具体数据类型
// 实现类--泛型类
public class MyListImp2<E> implements MyList<E> {
    @Override
    public void add(E e) {
        System.out.println("add e = " + e);
    }
}
