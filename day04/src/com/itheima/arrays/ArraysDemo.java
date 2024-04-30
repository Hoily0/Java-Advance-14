package com.itheima.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {
    /*
        Arrays数组工具类 :

            public static String toString(数据类型[] a) : 将传入的数组, 按照指定格式的字符串拼接, 并返回

            public static boolean equals(数据类型[] a, 数据类型[] a2) : 两个数组做内容的比较, 返回true, false

            public static void sort(数据类型[] a) : 对数组进行升序排序
                                                        - TODO: 后面讲解完二叉树数据结构, 再补充自定义排序规则

            public static int binarySearch(数据类型[] 数组名, 数据类型 元素值) : 使用二分查找法, 查找元素在数组中的索引位置
                                                        - 前提条件: 数组中的元素, 必须是有序的.
     */
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 66};
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println("-----------------------");

        int[] nums = {22, 55, 11, 44, 33};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("-----------------------");

        int[] arr = {11, 22, 33, 44, 55};
        int index = Arrays.binarySearch(arr, 66);
        System.out.println(index);
    }
}
