package com.itheima.demo7_exception.d4_finally;

public class Test {
    public static void main(String[] args) {
        try {
            int rs = 1 / 0;
            //int rs = 1 / 1;
        } catch (Exception e) {
            System.out.println("e = " + e);
            return;// 结束方法之前,需要先执行finally代码块,然后结束方法
            //System.exit(0);// 终止虚拟机
        } finally {
            System.out.println("finally 代码块 正常情况永远都会执行...");
        }
    }
}
