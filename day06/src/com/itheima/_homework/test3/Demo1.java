package com.itheima._homework.test3;

import java.util.ArrayList;

/*
    需求 : ArrayList有以下元素: "a","f","b","c","a","d"  对ArrayList集合去重

- 不允许使用 Set 集合 (因为是明天学的东西)
 */
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        ArrayList<String> newList = method1(list);
        System.out.println(newList);
    }

    //定义方法，传入集合（可能有重复元素），返回集合（去重后的集合）
    public static ArrayList<String> method1(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String e = list.get(i);
            if (newList.contains(e)) {

            } else {
                newList.add(e);
            }
        }
        return newList;
    }
}
