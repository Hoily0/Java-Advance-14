package com.itheima.demo16_this_constructor;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student("小红",18);
        System.out.println("s1.getName() = " + s1.getName());
        System.out.println("s1.getAge() = " + s1.getAge());
        System.out.println("s1.getSchoolName() = " + s1.getSchoolName());


        Student s2 = new Student("小黑黑",19,"家里蹲大学");
        System.out.println("s2.getName() = " + s2.getName());
        System.out.println("s2.getAge() = " + s2.getAge());
        System.out.println("s2.getSchoolName() = " + s2.getSchoolName());
    }
}
