package com.itheima.demo08_inherit;

public class TestAB {
    public int num = 0;

    public static void main(String[] args) {
        int num = -1;
        B b = new B();

        b.publicSonMethods();
        b.publicFatherMethods();
        System.out.println("b.num = " + b.num);
        System.out.println("this.num = ");
        System.out.println("num = " + num);


        A a = new A();
        a.defaultMethods();
        a.protectedMethods();
        a.publicMethods();
        //同包类不可调用private方法


    }
}
