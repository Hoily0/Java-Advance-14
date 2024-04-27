package com.itheima.demo16_stringjoiner;

import java.util.StringJoiner;

public class Test2 {
    public static void main(String[] args) {
        String[] arr = {"itheima", "java", "itcast"};
        String s = arrayToString(arr);
        System.out.println("s = " + s);
    }

    // 设计一个方法，用于返回任意整型数组的内容，要求返回的数组内容格式如：[11, 22, 33]
    public static String arrayToString(String[] arr) {
        // 1.创建StringJoiner对象
        StringJoiner sj = new StringJoiner(", ", "[", "]");


        // 2.循环遍历数组内容
        for (int i = 0; i < arr.length; i++) {
            // 3.拼接元素
            sj.add(arr[i]);

        }

        // 4.返回字符串对象
        return sj.toString();

    }
}
