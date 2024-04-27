package com.itheima.demo15_stringbuilder_usecase;

public class Test {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};
        String s = arrayToString(arr);
        System.out.println("s = " + s);
    }

    // 设计一个方法，用于返回任意整型数组的内容，要求返回的数组内容格式如：[11, 22, 33]
    public static String arrayToString(int[] arr) {
        // 1.创建StringBuilder对象
        StringBuilder sb = new StringBuilder();

        // 先拼接左括号
        sb.append("[");

        // 2.循环遍历数组内容
        for (int i = 0; i < arr.length; i++) {
            // 3.在循环中,按照指定格式拼接
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                // 不是最后一个,拼接格式: 元素逗号空格
                sb.append(arr[i]).append(", ");
            }
        }

        // 最后拼接由括号
        sb.append("]");


        // 4.返回字符串对象
        return sb.toString();

    }
}
