package com.itheima._genericity;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        //使用泛型，给泛型赋值
        MyArrayList<String, Integer> arrayList = new MyArrayList<>();
        String element1 = arrayList.getElement();
        Integer element2 = arrayList.getElement2();


    }
}

//定义泛型
interface Swiming<E> {
    void swim(E e);
}

//使用泛型
class SwimImpl implements Swiming<String> {
    @Override
    public void swim(String s) {
        System.out.println(s);
    }
}

//定义泛型
class MyArrayList<E, T> {
    E element1;
    T element2;

    public E getElement() {
        return element1;
    }

    public T getElement2() {
        return element2;
    }
}
