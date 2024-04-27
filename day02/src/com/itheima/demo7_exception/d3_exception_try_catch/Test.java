package com.itheima.demo7_exception.d3_exception_try_catch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        test2();
    }

    public static void test3() {


        try {
            int rs = 1 / 0;// ArithmeticException
            FileInputStream fis = new FileInputStream("D:\\workspace\\szitheima142\\day03\\aa.txt");// FileNotFoundException
            fis.read();
        } catch (Exception e) {
            // 出现异常后要执行的代码

        }


    }


    public static void test2() {

        try {
            //int rs = 1 / 0;// ArithmeticException
            FileInputStream fis = new FileInputStream("D:\\workspace\\szitheima142\\day03\\aa.txt");// FileNotFoundException
            fis.read();

        } catch (Exception e) {
            System.out.println("e = " + e);
        }

        System.out.println("异常处理完毕!");
    }

    public static void test1() {

        try {
            //int rs = 1 / 0;// ArithmeticException
            FileInputStream fis = new FileInputStream("D:\\workspace\\szitheima142\\day03\\a.txt");// FileNotFoundException
            fis.read();

        } catch (ArithmeticException e1) {
            System.out.println("e1 = " + e1);
        } catch (FileNotFoundException e2) {
            System.out.println("e2 = " + e2);
        } catch (IOException e3) {
            System.out.println("e3 = " + e3);
        }

        System.out.println("异常处理完毕!");
    }
}
