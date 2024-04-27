package com.itheima.demo12_packaging;

public class Test {
    public static void main(String[] args) {
        // 自动装箱：基本数据类型可以自动转换为包装类型。
        int num = 10;
        Integer i = num;
        System.out.println("i = " + i);

        double numD = 3.14;
        Double d = numD;
        System.out.println("d = " + d);

        // 自动拆箱：包装类型可以自动转换为基本数据类型。
        int a = i;
        System.out.println("a = " + a);

        double b = d;
        System.out.println("b = " + b);
    }
}
