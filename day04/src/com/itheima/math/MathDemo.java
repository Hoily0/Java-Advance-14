package com.itheima.math;

public class MathDemo {
    public static void main(String[] args) {
        // 获取绝对值
        System.out.println(Math.abs(-10));
        System.out.println("------------------------");
        // 向上取整
        System.out.println(Math.ceil(12.3));
        System.out.println(Math.ceil(12.9));
        System.out.println(Math.ceil(12.0));
//        Math.cell 向上取整
//        System.out.println("------------------------");
        // 向下取整
        System.out.println(Math.floor(12.3));
        System.out.println(Math.floor(12.9));
        System.out.println(Math.floor(12.0));

//        Math.floor()//向下取整
        System.out.println("------------------------");
        // 四舍五入
        System.out.println(Math.round(12.3));
        System.out.println(Math.round(12.9));
//        Math.round()//四舍五入
        System.out.println("------------------------");
        // 求最值
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));
        System.out.println("------------------------");
        // 求次幂
        System.out.println(Math.pow(2, 3));
        System.out.println("------------------------");
        // 生成随机数
        System.out.println(Math.random());
    }
}
