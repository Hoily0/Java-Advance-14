package com.itheima.code;

public class CodeDemo1 {
    /*
        代码块: Java中的一对 {}

        分类:
             1. 局部代码块 : 方法中的一对 {}
                    - 作用: 限定变量的生命周期, 提早的释放内存

             2. 构造代码块 : 类中方法外的一对 {}
                    - 特点: 在创建对象, 执行构造方法之前, 都要先执行构造代码块
                            - 原理: 在编译生成字节码之后, 构造代码块, 会将自己内部的代码, 分散到该类的所有构造方法中.
                    - 作用: 可以对构造方法中的重复代码, 进行优化

             3. 静态代码块 : 类中方法外的一对 {} 需要被static修饰
                    - 特点: 随着类的加载而执行, 因为类的字节码只加载一次, 所以静态代码块也只会执行一次
                    - 作用:
                            - 在项目启动的时候, 通过静态代码块, 去加载项目需要用到的配置文件(资源文件)

             4. 同步代码块 : TODO 多线程位置讲解
     */
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student(10);
    }
}

class Student {

    static {
        System.out.println("Student类的静态代码块");
    }


    {
        System.out.println("Student类的构造代码块");
    }

    public Student() {
        System.out.println("Student类的空参构造方法");
    }

    public Student(int age) {
        System.out.println("Student类的带参构造方法");
    }
}