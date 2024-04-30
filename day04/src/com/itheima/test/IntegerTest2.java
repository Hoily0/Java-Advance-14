package com.itheima.test;

public class IntegerTest2 {
    public static void main(String[] args) {
        String s = "10,50,30,20,40";

        // 1. 根据逗号进行切割
        String[] sArr = s.split(",");

        // 2. 创建一个整数类型的数组, 准备存储转换后的数据
        int[] nums = new int[sArr.length];

        // 3. 从字符串数组中取出数据, 转换为整数, 存入整数数组
        for (int i = 0; i < sArr.length; i++) {
            int num = Integer.parseInt(sArr[i]);
            nums[i] = num;
        }

        // 4. 求最大值
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("最大值为:" + max);
    }
}
