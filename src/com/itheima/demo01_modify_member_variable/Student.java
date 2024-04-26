package com.itheima.demo01_modify_member_variable;

/**
 * 成员变量按照有无static修饰，分为两种:
 *      类变量：有static修饰，属于类，在计算机里只有一份，会被类的全部对象共享。
 *              使用方式：类名.类变量 (推荐)
 *                      对象.类变量(不推荐)
 *      实例变量（对象的变量）：无static修饰，属于每个对象的。
 *              使用方式：对象.实例变量
 */
public class Student {
    static String name;//类的变量
    int age;//实例变量
}
