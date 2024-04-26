package com.itheima.demo08_inherit;

/**
 * Java中提供了一个关键字extends，用这个关键字，可以让一个类和另一个类建立起父子关系。
 * 子类能继承父类的非私有成员（成员变量、成员方法）。
 * 子类的对象是由子类、父类共同完成的。
 */
public class A {
    private String name1;//私有成员变量

    private void getName1() {
        System.out.println("私有成员方法");
    }


    public String name2;//公开成员变量

    public void getName2() {
        System.out.println("非私有成员方法");
    }

}
