package com.itheima._genericity;

/*
    方法泛型
 */
public class Demo3 {
    public static void main(String[] args) {
        Integer integer = show(100);
        String s = show("abc");
    }

    public static <T> T show(T t) {
        System.out.println(t);
        return t;
    }
}
