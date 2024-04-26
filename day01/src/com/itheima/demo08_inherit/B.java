package com.itheima.demo08_inherit;

public class B extends A {

    private String name3;

    public void getName3() {
        //子类能继承父类的非私有成员（成员变量、成员方法）。
        System.out.println("name2 = " + name2);
        getName2();

        //私有属性 和 方法不能被子类使用
        //System.out.println("name1 = " + name1);
        //getName1();
    }
}
