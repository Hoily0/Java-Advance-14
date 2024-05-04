package com.itheima.ex;

import java.util.Scanner;

/*
    键盘录入姓名和年龄和生日
    String name
    int  age
    String birthday
    如果录入过程中报错，我们程序能够继续执行后面的录入内容
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = 0;//ctrl+alt+T
        try {
            age = sc.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            sc.next();//失效
        }
        System.out.println("请输入生日：");
        String birthday = sc.next();
        System.out.println(name + " " + age + " " + birthday);
    }
}
