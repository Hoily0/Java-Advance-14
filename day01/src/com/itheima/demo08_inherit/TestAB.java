package com.itheima.demo08_inherit;

public class TestAB {
    public static void main(String[] args) {
        B b = new B();
        //子类能继承父类的非私有成员（成员变量、成员方法）。
        System.out.println("b.name2 = " + b.name2);
        //System.out.println("b.name1 = " + b.name1);
        //System.out.println("b.name3 = " + b.name3);

        b.getName2();
        b.getName3();
        //b.getName1();
    }
}
