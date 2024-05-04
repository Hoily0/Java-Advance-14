package com.itheima.object.test1;

public class EqualsTest {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("张三", 23);
        Student stu3 = new Student("李四", 23);

        System.out.println(stu1.equals(stu2));
    }
}
