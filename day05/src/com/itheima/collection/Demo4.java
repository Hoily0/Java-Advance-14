package com.itheima.collection;

import java.util.LinkedList;

public class Demo4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("aaa");

        //在头部添加一个元素
        list.addFirst("hello");
        //在尾部添加一个元素
        list.addLast("java");
        System.out.println(list);
        //获取首尾元素
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        //删除首尾元素
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
