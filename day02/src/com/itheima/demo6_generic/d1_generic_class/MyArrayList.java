package com.itheima.demo6_generic.d1_generic_class;

// 泛型类
public class MyArrayList<E> {// E:表示一种未知的数据类型,使用的该类的时候确定其具体数据类型
    E num;

    public void add(E e) {
        System.out.println("e = " + e);
    }

}
