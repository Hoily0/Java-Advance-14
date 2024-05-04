package com.itheima.ex;

/*
    处理异常方式一：
    try{} catch(){}  捕获异常，不让异常往上抛。
    结果：程序会继续往下执行，不会停止。
    弊端：报错了，程序员在控制台并不能见到异常信息，不利于我们改bug。
    希望：即能保证程序继续执行，又能让程序员看到红色异常信息。
         e.printStackTrace();//打印异常，但不停止程序
 */
public class Demo2 {
    public static void main(String[] args) {
        show();
    }

    private static void show() {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (Exception e) {//写个父类，就能捕获所有的异常
            e.printStackTrace();//红色字体打印异常信息到控制台，共程序员查阅改bug。但他不会停止程序
        }
        System.out.println("123");
        System.out.println("123");
        System.out.println("123");
        System.out.println("123");
    }
}
