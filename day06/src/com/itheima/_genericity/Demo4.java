package com.itheima._genericity;

/*
      方法上的泛型:传入一个任意类型的数组，返回索引0元素
 */
public class Demo4 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4};
        String[] arr2 = {"aaa", "bb", "xcc"};

        Integer num = get(arr);
        String s = get(arr2);
        System.out.println(num);//1
        System.out.println(s);//aaa
    }

    public static <T> T get(T[] arr) {
        return arr[0];
    }
}
