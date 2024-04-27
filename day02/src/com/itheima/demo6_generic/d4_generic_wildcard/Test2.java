package com.itheima.demo6_generic.d4_generic_wildcard;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        // 泛型通配符: ?  表示一切类型
        // Integer继承Number,Number继承Object
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();

        method(list1);
        method(list2);
        method(list3);
        method(list4);


    }

    // 需求: 定义一个方法,接收任意泛型的ArrayList集合对象
   /* public static void method(ArrayList<?> list){// 接收的集合泛型可以是任意类型
        // 如果形参泛型使用的是通配符?,那么该集合只能遍历,不能增加元素
    }*/

    public static void method(ArrayList list) {// 接收的集合泛型可以是任意类型
        // 如果形参泛型不知道,那么该集合元素的类型默认是Object类型
        list.add("aa");
        System.out.println("list = " + list);
    }

}
