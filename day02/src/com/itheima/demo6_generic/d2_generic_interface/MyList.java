package com.itheima.demo6_generic.d2_generic_interface;

// 泛型接口
public interface MyList<E> {
    public abstract void add(E e);

    public default void show(E e) {
        System.out.println("show e = " + e);
    }
}
