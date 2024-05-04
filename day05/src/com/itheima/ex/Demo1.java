package com.itheima.ex;

import java.text.SimpleDateFormat;

public class Demo1 {
    public static void main(String[] args) {
        int num = show();//alt+ 回车
    }

    private static int show() {
        int[] ints = new int[1];
        ints[10] = 10;//越界异常，在这行就会创建一个异常对象往上抛处
        System.out.println(123);
        return 0;
    }
}
