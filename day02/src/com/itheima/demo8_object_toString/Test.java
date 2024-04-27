package com.itheima.demo8_object_toString;

public class Test {
    public static void main(String[] args) {
        /*
            类的全限定名: 包名+类名
            Object类:
                public String toString(); 默认返回对象的字符串,格式为: 类的全限定名@地址值

         */
        // 创建Student对象
        Student s = new Student("张三", 18);
        System.out.println(s);// 打印对象,其实打印的是对象调用toString方法的返回值
        System.out.println(s.toString());
        // 开发中,打印对象往往希望打印的是对象的所有属性值---重写Object类的toString方法


    }
}
