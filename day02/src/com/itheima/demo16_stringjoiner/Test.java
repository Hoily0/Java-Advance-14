package com.itheima.demo16_stringjoiner;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        // 创建StringJoiner对象
        StringJoiner sj1 = new StringJoiner(",");// 指定拼接的间隔符

        // 拼接
        sj1.add("itheima");
        sj1.add("itcast");
        sj1.add("java");

        // 打印
        System.out.println("sj1 = " + sj1);//itheima,itcast,java
        System.out.println("sj1.length() = " + sj1.length());
        String s = sj1.toString();
        System.out.println("s = " + s);// itheima,itcast,java

        System.out.println("------------------");

        // 创建StringJoiner对象
        StringJoiner sj2 = new StringJoiner(",", "[", "]");// 指定拼接的间隔符,以及前缀和后缀

        // 拼接
        sj2.add("itheima");
        sj2.add("itcast");
        sj2.add("java");

        // 打印
        System.out.println("sj2 = " + sj2);// [itheima,itcast,java]

    }
}
