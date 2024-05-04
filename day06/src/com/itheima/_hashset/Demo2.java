package com.itheima._hashset;


import java.util.Date;

/*
    Hashcode方法是继承自Object类，所有对象都有
 */
public class Demo2 {
    public static void main(String[] args) {
        Student s0 = new Student("tom", "上海");
        Student s1 = new Student("tom", "上海");
        Student s2 = new Student("jerry", "上海");
        Student s3 = new Student("linda", "上海");
        Student s4 = new Student("rose", "上海");

        System.out.println(s1.hashCode());
        //4214108 % 16 = 0-15
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println("---------------");
        Date date1 = new Date();
        Date date2 = new Date();
        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());

    }
}
