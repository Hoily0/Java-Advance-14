package com.itheima.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo1 {
    public static void main(String[] args) {


        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        set.add("ddd");


        System.out.println(set);
        System.out.println("-------------------");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("-------------------");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("--------------------");
        set.forEach(s -> System.out.println(s));
    }
}
