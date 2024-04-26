package com.itheima.demo14_subclass_access_members;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        //调用的子类变量、子类方法
        System.out.println("z.name = " + z.name);
        z.print1();
        z.print2();
    }
}
