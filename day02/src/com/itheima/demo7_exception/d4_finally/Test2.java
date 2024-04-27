package com.itheima.demo7_exception.d4_finally;

public class Test2 {

    public static void main(String[] args) {
        System.out.println(test1());// 30
    }

    public static int test1() {
        int num = 10;
        try {
            int rs = 1 / 0;
        } catch (Exception e) {
            num = 20;
            return num; // return语句: 1.先记录要返回的数据,然后执行finally代码块, 2.把之前记录的返回值返回,并结束方法
        } finally {
            num = 30;
            return num;
        }

    }
}
