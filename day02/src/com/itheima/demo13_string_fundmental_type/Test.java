package com.itheima.demo13_string_fundmental_type;

public class Test {
    public static void main(String[] args) {
        // 基本类型------>String  数据+""
        int num = 10;
        String s1 = num + "";
        System.out.println("s1 = " + s1);


        // String---->基本类型   使用包装类的静态方法parseXXX(),但是Character没有这个方法,其余包装类都有
        String s2 = "100";
        String s3 = "3.14";
        String s4 = "true";
        int num1 = Integer.parseInt(s2);
        System.out.println("num1 = " + num1);// 100

        double num2 = Double.parseDouble(s3);
        System.out.println("num2 = " + num2);// 3.14

        boolean b = Boolean.parseBoolean(s4);
        System.out.println("b = " + b);// true


        System.out.println("--------------------");

        int i = Integer.valueOf(s2);
        System.out.println("i = " + i);

    }
}
