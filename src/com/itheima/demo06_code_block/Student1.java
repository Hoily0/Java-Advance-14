package com.itheima.demo06_code_block;

/**
 * 代码块分为两种：
 * 静态代码块:
 *   格式：static { }
 *   特点：类加载时自动执行，由于类只会加载一次，所以静态代码块也只会执行一次。
 *   作用：完成类的初始化，例如：对类变量的初始化赋值。

 */
public class Student1 {
    static String name;
    static int age;

    private Student1(){
        System.out.println("无参构造方法执行了哈");
    }

    static {
        System.out.println("静态代码块执行了哈");
        name = "小红";
        age = 18;
    }

    public Student1(String name){
        System.out.println("有参构造方法执行了哈");
        this.name = name;
    }
}
