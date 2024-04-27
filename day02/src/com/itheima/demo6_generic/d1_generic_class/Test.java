package com.itheima.demo6_generic.d1_generic_class;

public class Test {
    public static void main(String[] args) {
        // 创建MyArrayList对象,指定泛型类型为String
        MyArrayList<String> list1 = new MyArrayList<>();
        list1.num = "666";
        list1.add("itheima");

        System.out.println("-------------");

        // 创建MyArrayList对象,指定泛型类型为Integer
        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.num = 100;
        list2.add(200);

    }
}
