package com.itheima.demo01_modify_member_variable;

public class Test {
    public static void main(String[] args) {

        /***************************类变量*********************************/
        //名.类变量 (推荐)
        Student.name = "小红";
        System.out.println("Student.name = " + Student.name);//小红

        //对象.类变量(不推荐)
        Student s1 = new Student();
        s1.name = "小黄";
        System.out.println("Student.name = " + Student.name);//小黄

        Student s2 = new Student();
        s2.name = "小黑";
        System.out.println("Student.name = " + Student.name);//小黑

        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);
        System.out.println("Student.name = " + Student.name);


        /***************************实例变量*********************************/
        s1.age = 18;
        s2.age = 99;
        System.out.println("s1.age = " + s1.age);
        System.out.println("s2.age = " + s2.age);
        //System.out.println("Student.age = " + Student.age);//报错

        s1.sex = "女";
        Student.sex = "男";
        System.out.println(s1.sex == Student.sex);
    }
}
