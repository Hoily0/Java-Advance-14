package com.itheima._genericity;

import java.util.ArrayList;

/*
    1.类上的泛型
    2.接口上的泛型：定义Data接口，伴随对泛型类进行增删改查，实现类Student和Teacher实现接口定好类型
    3.方法上的泛型:传入一个任意类型的数组，返回索引0元素
    4.泛型上下限
 */
public class Demo1 {

    public static void main(String[] args) {
        ArrayList<B> list = new ArrayList<>();
        show1(list);
    }

    public static void show1(ArrayList<? super B> list) {

    }

    public static void show2(ArrayList<? extends B> list) {

    }
}

class A {
}

class B extends A {
}

class C extends B {
}
