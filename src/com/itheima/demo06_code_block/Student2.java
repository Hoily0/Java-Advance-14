package com.itheima.demo06_code_block;

/**
 * 实例代码块:
 * 格式：{ }
 * 特点：每次创建对象时，执行实例代码块，并在构造器前执行。
 * 作用：和构造器一样，都是用来完成对象的初始化的，例如：对实例变量进行初始化赋值。
 */
public class Student2 {
    String name;
    int age;

    {
        System.out.println("实例代码块被执行了哈");
        name = "小花";
        age = 18;
    }

    public Student2(){
        System.out.println("无参构造方法执行了哈");
    }

    public Student2(String name){
        System.out.println("You参构造方法执行了哈");
        this.name = name;
    }
}
