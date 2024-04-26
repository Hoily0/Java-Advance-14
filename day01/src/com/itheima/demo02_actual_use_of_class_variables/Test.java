package com.itheima.demo02_actual_use_of_class_variables;

public class Test {
    public static void main(String[] args) {
        new User();
        new User();
        new User();
        new User();

        System.out.println("User.number = " + User.number);
    }
}
