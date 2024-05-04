package com.work.controller;

/**
 * @author 30391
 */
public class ArrayGenerics {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 9, 8, 4, 3, 45, 8};
        System.out.println("findIndex(arr) = " + findIndex(arr));

    }

    private static <Y> Y findIndex(Y[] y) {
        return y[0];
    }


}
