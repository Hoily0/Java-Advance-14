package com.itheima.demo03_static_modification_member_method;

public class Test {
    public static void main(String[] args) {
        /*************类方法使用方式 *****************/
        //类名.类方法 (推荐)
        Student.printHelloWorld();
        System.out.println("-----------------------------");
        //对象名.类方法(不推荐)
        Student s1 = new Student();
        s1.printHelloWorld();
        System.out.println("-----------------------------");

        /*************实例方法使用方式 *****************/
        Student s2 = new Student();
        s2.score=90;
        s2.printPass();

    }
}
