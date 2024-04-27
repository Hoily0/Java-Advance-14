package com.itheima.demo9_object_equals;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 19);
        Student s2 = new Student("张三", 19);
        // 需求:比较s1和s2对象是否相等
        // 没有重写equals方法,使用的Object类继承过来的equals方法
        //System.out.println(s1 == s2);// false
        //System.out.println(s1.equals(s2));// false

        // 开发中,如果2个同类型的对象,并且所有属性值相同,往往认为这2个对象是相等的
        // 重新Object类继承过来的equals方法---比较所有属性值
        System.out.println(s1.equals(s2));// true

        /*
            如果要比较2个对象是否相等,在类中重写equals方法(alt+insert---equals and hashCode)
         */
    }
}
