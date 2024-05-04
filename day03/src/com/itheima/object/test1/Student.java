package com.itheima.object.test1;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    @Override
    /*
        this : stu1
        o : stu2
     */
    public boolean equals(Object o) {
        // 两个对象使用==号比较地址, 如果地址相同, 直接返回true
        if (this == o) {
            return true;
        }

        // 代码要是能够执行到这一步, 代表this(stu1)绝对不是null值
        if (o == null || this.getClass() != o.getClass()) {
            /*
               this(stu1) : 不是null
               o(stu2) : 是null
               一个有值, 另一个没有值, 直接返回false
               ----------------------------------------
               getClass() : 获取类的字节码
               this.getClass() != o.getClass() : 获取两个对象各自的字节码进行比较, 如果字节码不相同
               说明类型不相同, 直接返回false
             */
            return false;
        }

        // 代码要是能够执行到这一步, 说明类型肯定相同, 放心的做向下转型
        Student student = (Student) o;
        // 比较内容
        return this.age == student.age && Objects.equals(this.name, student.name);
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
