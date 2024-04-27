package com.itheima.demo7_exception.d1_exception_overview;

public class Test {
    public static void main(String[] args) {
        System.out.println("开始");
        chu(10, 0);
        System.out.println("结束");
    }

    // 功能方法
    public static void chu(int a, int b) {
        int rs = a / b;
        System.out.println("rs = " + rs);
    }
}
