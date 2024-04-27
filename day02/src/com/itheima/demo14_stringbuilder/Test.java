package com.itheima.demo14_stringbuilder;

public class Test {
    public static void main(String[] args) {
        // 创建一个可变字符串对象
        StringBuilder sb1 = new StringBuilder();// ""
        StringBuilder sb2 = new StringBuilder("itheima");// "itheima"
        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);

        // 拼接
        //StringBuilder sb = sb2.append(666);
        //System.out.println("sb = " + sb);
        //System.out.println("sb2 = " + sb2);
        //sb2.append(666);
        //sb2.append(8.88);

        // 链式编程: 上一个方法的返回值调用下一个方法
        sb2.append(666).append(8.88);
        System.out.println("sb2 = " + sb2);

        // 反转
        sb2.reverse();
        System.out.println("sb2 = " + sb2);

        // StringBuilder--->String
        String s = sb2.toString();
        System.out.println("s = " + s);

    }
}
