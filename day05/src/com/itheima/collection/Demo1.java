package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
    Collection：
        没有索引相关的功能
 */
public class Demo1 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("aaa");

        list.clear();//清空集合
        System.out.println(list);
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("aaa");
        //删除0这个元素，而集合中没有这个元素，返回false，代表没有删除成功
        boolean flag = list.remove(0);
        System.out.println(flag);
        //删除第一个aaa
        boolean flag2 = list.remove("aaa");
        System.out.println(flag2);//true
        System.out.println(list);
        //包含"aaa"这个元素
        boolean flag3 = list.contains("aaa");
        System.out.println(flag3);
        //集合是不是空集合
        boolean flag4 = list.isEmpty();
        System.out.println(flag4);//false
        list.clear();//清空
        boolean flag5 = list.isEmpty();
        System.out.println(flag5);//true
        System.out.println(list.size());
        //思考怎么遍历集合？
        System.out.println("------------");


    }
}
