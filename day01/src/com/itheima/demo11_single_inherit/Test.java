package com.itheima.demo11_single_inherit;

import com.itheima.demo08_inherit.A;

public class Test {
    public static void main(String[] args) {
        A1 a1 = new A1();
        System.out.println("a.name = " + a1.name);
        B b = new B();
        System.out.println("b.name = " + b.name);
        A2 a2 = new A2();
        System.out.println("a2.name = " + a2.name);
        C c = new C();
        System.out.println("c.name = " + c.name);
    }
}
