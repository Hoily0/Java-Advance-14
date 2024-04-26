package com.itheima.demo03_static_modification_member_method;

/**
 *  成员方法的分类
 *      类方法：  有static修饰的成员方法，属于类。
 *          使用方式 类名.类方法 (推荐)
 *                 对象名.类方法(不推荐)
 *      实例方法：无static修饰的成员方法，属于对象。
 *          使用方式 对象.实例方法
 */
public class Student {

    double score;

    /**
     * 类方法|成员方法|静态方法
     */
    public static void printHelloWorld(){
        System.out.println("hello world");
        System.out.println("hello world");
    }

    /**
     * 无static方法
     */
    public void printPass(){
        System.out.println(score > 60 ? "通过" : "未通过");
    }

}
