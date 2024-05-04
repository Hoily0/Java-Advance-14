package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/*
    迭代器：一次性的，用完想再用，就得重新创建了。
 */
public class Demo2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("aaa");
        //得到迭代器对象
        Iterator<String> itr = list.iterator();
        //判断当前指针指向元素是否有值，是true   false
        while (itr.hasNext()) {
            String element = itr.next();//拿到之后，指针下移一位
            System.out.println(element);
        }
        System.out.println("----------------");
        //增强for循环，本质也是迭代器
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------------------");
        list.forEach(s -> System.out.println(s));//扩展遍历方式

    }
}
