package com.itheima.demo5_generic_overview;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // ArrayList使用的时候不带泛型
        ArrayList list1 = new ArrayList();// 没有指定泛型,集合可以添加任意类型的数据
        list1.add("szitheima666");
        list1.add(1000);
        list1.add(true);
        list1.add("szitheima142");

        // 需求: 打印输出集合中字符串元素的长度
        /*for (int i = 0; i < list1.size(); i++) {
            // 获取元素
            Object obj = list1.get(i);
            String s = (String)obj;// 会出现ClassCastException类型转换异常
            System.out.println("字符串元素的长度: " + s.length());
        }*/

        for (Object obj : list1) {
            // 获取元素
            if (obj instanceof String) {
                String s = (String) obj;
                System.out.println("字符串元素的长度: " + s.length());
            }
        }

        System.out.println("------------------");

        // 作用：在编译阶段可以避免出现一些非法的数据！这样也可以避免强制类型转换，及其可能出现的异常。
        // ArrayList使用的时候带泛型
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("szitheima666");
        //list2.add(1000);// 编译报错,因为list2集合元素只能存储String类型的元素
        //list2.add(true);// 编译报错,因为list2集合元素只能存储String类型的元素
        list2.add("szitheima142");

        for (int i = 0; i < list2.size(); i++) {
            String s = list2.get(i);
            System.out.println("字符串元素的长度: " + s.length());
        }

    }
}
