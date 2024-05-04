package com.itheima.homework;

import java.util.ArrayList;

/*
    需求 :  创建一个集合, 内部存储元素 ("15611111111", "18888888888", "156JQKA1234", "你好", "哈哈")
    - 将集合中错误的手机号删除, 删除之后, 打印集合中剩余的元素


 */
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("15611111111");
        list.add("18888888888");
        list.add("156JQKA1234");
        list.add("你好");
        list.add("哈哈");
        //删除错误的手机号
        //1.遍历集合获得每个手机号
        //2.使用正则判断手机号是否正确
        String regex = "1[3-9]\\d{9}";
        for (int i = 0; i < list.size(); i++) {
            String phone = list.get(i);
            boolean flag = phone.matches(regex);
            //3.删除
            if (!flag) {
                list.remove(i);
                i--;//避免跳过元素
            }
        }
        System.out.println(list);
    }
}
