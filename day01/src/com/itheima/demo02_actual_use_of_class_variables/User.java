package com.itheima.demo02_actual_use_of_class_variables;

/**
 * 类变量的应用场景
 * 在开发中，如果某个数据只需要一份，且希望能够被共享(访问、修改），则该数据可以定义成类变量来记住。
 */
public class User {
    public static int number;

    public User() {
        User.number++;
    }
}
