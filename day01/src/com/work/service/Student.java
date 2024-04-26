package com.work.service;

public class Student {
    //实例变量
    int age = 18;

    //静态变量
    public static String schoolName = "黑马";

    //实例代码块：实例代码块会执行在每一个构造方法之前
    {
        System.out.println("实例代码块---------------" + this.age);//每次创建对象，都会执行一次实例代码块
    }

    // 静态代码块
    static {
        System.out.println("静态代码块---------------" + schoolName);//类加载时执行，所以只执行一次
        schoolName = "传智";
    }

}