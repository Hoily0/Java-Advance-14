package com.itheima.demo11_objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(null, 19);
        Student s2 = new Student("张三", 19);

        System.out.println(s1.equals(s2));

        Student s3 = null;
        System.out.println(Objects.isNull(s3));// true
        System.out.println(Objects.isNull(s1));// false

        System.out.println(Objects.nonNull(s3));// false
        System.out.println(Objects.nonNull(s1));// true
    }
}
