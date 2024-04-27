package com.itheima.demo7_exception.d2_exception_throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        //test();
    }


    //声明处理异常（throws）: 在方法上使用throws关键字，可以将方法内部出现的异常抛出去给调用者处理。
    public static void test() throws ArithmeticException, FileNotFoundException {

        int rs = 1 / 0;// ArithmeticException

        FileInputStream fis = new FileInputStream("D:\\workspace\\szitheima142\\day03\\a.txt");// FileNotFoundException
    }

    // 如果方法中有多个异常要声明处理,直接声明处理一个最大的异常(Exception)---所有异常类的父类
    public static void test1() throws Exception {

        int rs = 1 / 0;// ArithmeticException

        FileInputStream fis = new FileInputStream("D:\\workspace\\szitheima142\\day03\\a.txt");// FileNotFoundException

        fis.read();
    }
}
