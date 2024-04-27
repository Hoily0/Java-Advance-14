package com.itheima.demo9_object_equals;

import java.util.Objects;

public class Student {// 默认继承Object类
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        // 如果2个对象的地址值相等,直接返回true
        if (this == o) return true;
        // 如果参数为null或者两个对象的类型不相等,直接返回false
        if (o == null || this.getClass() != o.getClass()) return false;
        // 说明2个对象的地址不一样,类型相同,那就比较所有属性值即可
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }


}
