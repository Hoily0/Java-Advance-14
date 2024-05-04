package com.itheima.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("aaa");
        //指定索引位置添加元素，其他元素默认向后挤
        list.add(1, "abc");
        //删除指定索引的元素
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        //修改索引0的值为“a”
        list.set(0, "a");
        System.out.println(list);
        //获取指定索引的元素
        System.out.println(list.get(0));
        System.out.println("-----------------");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("------------------");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
