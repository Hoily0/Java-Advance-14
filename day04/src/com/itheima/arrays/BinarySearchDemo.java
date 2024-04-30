package com.itheima.arrays;

import java.util.Arrays;

public class BinarySearchDemo {
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55};

        System.out.println(binarySearch(100, arr));

    }

    public static int binarySearch(int num, int[] arr) {
        // 1. 定义两个变量, 表示最小索引和最大索引
        int min = 0;
        int max = arr.length - 1;
        // 2. 编写循环的折半条件
        while (min <= max) {
            // 3. 计算中间索引
            int mid = (min + max) / 2;
            // 4. 比较
            if (num > arr[mid]) {
                // [要查找的元素] 比 [中间索引对应的元素] 大, 改变min指针的指向
                min = mid + 1;
            } else if (num < arr[mid]) {
                // [要查找的元素] 比 [中间索引对应的元素] 小, 改变max指针的指向
                max = mid - 1;
            } else {
                // 找到了, 返回正确的索引
                return mid;
            }
        }

        // 5. 代码要是走到这里, 说明没找到
        return -1;
    }
}
