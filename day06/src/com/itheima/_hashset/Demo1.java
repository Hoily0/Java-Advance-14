package com.itheima._hashset;

import java.util.Collection;
import java.util.HashSet;

/*
    HashSet:
    无序，去重，没有索引
 */
public class Demo1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        boolean flag1 = set.add("aaa");
        boolean flag2 = set.add("bbb");
        boolean flag3 = set.add("ccc");
        boolean flag4 = set.add("eee");
        boolean flag5 = set.add("eee");//false,没保存成功

        System.out.println(set.size());//4，去重
        System.out.println(set);
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);
        System.out.println(flag5);
    }
}
