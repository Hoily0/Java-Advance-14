package com.itheima.homework;

import java.util.Arrays;

/*
    需求 :  键盘录入字符串 "10 20 50 30 40"
    - 请将字符串中的数字,  降序排列  "50 40 30 20 10"
 */
public class Demo3 {
    public static void main(String[] args) {
        String s = "10 20 50 30 40";
        //1.转成字符串数组
        String[] strArr = s.split(" ");
        //2.把字符串数组转成int数组
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            int num = Integer.parseInt(strArr[i]);
            intArr[i] = num;
        }
        //3.排序(由小到大)
        Arrays.sort(intArr);
        //4.反转(为什么要除2 ，交换次数刚好等于长度的1/2)
        for (int i = 0; i < intArr.length / 2; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[intArr.length - 1 - i];
            intArr[intArr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(intArr));
    }
}
