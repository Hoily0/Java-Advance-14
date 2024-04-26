package com.itheima.demo07_singleton_design_pattern;

/**
 * 饿汉式单例：拿对象时，对象早就创建好了。
 * 把类的构造器私有。
 * 在类中创建该类的唯一对象。
 * 提供一个公共的类方法，返回该唯一对象。
 */
public class A {
    //在类中创建该类的唯一对象
    private static A a = new A();

    /**
     * 把类的构造器私有
     */
    private A() {
    }

    //提供一个公共的类方法，返回该唯一对象
    public static A getA() {
        return a;
    }
}
