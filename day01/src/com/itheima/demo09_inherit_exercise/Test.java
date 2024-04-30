package com.itheima.demo09_inherit_exercise;

import com.itheima.demo08_inherit.A;
import com.itheima.demo08_inherit.B;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("老王");
        t.setSkill("编程能力");
        t.printInfo();
        System.out.println("----------------------------");
        Consultant c = new Consultant();
        c.setName("小红");
        c.setNumber(100);
        c.printInfo();

        A a = new A();
        a.publicMethods();
        //不同包不可调用protected方法、不可调用default方法，不可调用private方法。

        B b = new B();
        b.publicMethods();
        //继承下，可调用父类的public方法。
    }
}
