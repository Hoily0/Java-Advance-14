package com.itheima.demo04_actual_use_of_class_methods;

import java.util.Arrays;

public class LoginTest {
    public static void main(String[] args) {

        System.out.println(MyUtils.getCode(4));

        int[] nums = {21, 23, 7, 98, 48, 22, 10, 7};

        System.out.println(ArrayTools.getArrayMax(nums));

        System.out.println("ArrayTools.getArrayMin(nums) = " + ArrayTools.getArrayMin(nums));

        System.out.println(Arrays.toString(ArrayTools.getSortMax(nums)));
    }
}
