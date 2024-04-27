package com.itheima.demo7_exception.d5_define_exception;

public class Test {
    public static void main(String[] args) {
        method(-18);
    }

    // 定义一个方法,接收一个年龄进行操作
    public static void method(int age) {
        // 非法数据判断
        if (age < 0) {
            // 如果数据非法,应该把错误数据信息告诉调用者
            // 现在,专业--异常
            throw new AgeException("年龄数据非法!");

            // 以前,不专业
            //System.out.println("年龄数据非法!");
            //return;
        }

        if (age < 18) {
            System.out.println("少儿不宜!");
        } else {
            System.out.println("欢迎进入系统!");
        }
    }
}
