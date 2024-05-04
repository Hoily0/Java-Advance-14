package com.itheima._hashset;

import java.util.Date;
import java.util.HashSet;

/*
    Hashcode方法是继承自Object类，所有对象都有
 */
public class Demo4 {
    public static void main(String[] args) {
        Student s0 = new Student("tom", "上海");
        Student s1 = new Student("tom", "上海");

        System.out.println(s0.hashCode());
        System.out.println(s1.hashCode());
        HashSet<Student> set = new HashSet<>();
        set.add(s0);
        set.add(s1);
        /*
            两个对象hashcode大概率不同，
            大概率不会在同一个索引
            就算在同一个索引，也会使用equals进行比较
            我们没有重写equals，此时的比较其实比的是地址。
            结论：肯定不会去重。
         */
        System.out.println(set);

    }
}
