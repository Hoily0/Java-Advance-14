package com.itheima.demo04_actual_use_of_class_methods;

public class ArrayTools {

    //求数字最大值
    public static int getArrayMax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    //求最小值
    public static int getArrayMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }

    public static int[] getSortMax(int[] nums) {
        int[] max = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                max[i] = nums[i];
            }
        }
        return max;
    }


}
