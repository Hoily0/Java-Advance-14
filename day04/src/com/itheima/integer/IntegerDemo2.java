package com.itheima.integer;

public class IntegerDemo2 {
    /*
        Integer类的进制转换方法
     */
    public static void main(String[] args) {

        int num = 456;

        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toOctalString(num));
        System.out.println(Integer.toHexString(num));

    }
}
