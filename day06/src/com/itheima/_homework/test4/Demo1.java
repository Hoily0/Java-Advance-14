package com.itheima._homework.test4;

import java.util.ArrayList;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        //1.人的集合
        ArrayList<String> list = new ArrayList<>();
        list.add("郭靖");
        list.add("黄蓉");
        list.add("黄药师");
        list.add("老顽童");
        list.add("瑛姑");
        //2.阄的集合
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("吃芥末");
        list2.add("学羊叫");
        list2.add("10个俯卧撑");
        list2.add("喝一杯啤酒");
        list2.add("蛙跳10个");
        //3.随机抓阄
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            //获取随机索引
            int index = random.nextInt(list2.size());//0-4随机数
            //随机抓阄
            String oldValue = list2.remove(index);
            System.out.println(name + ": " + oldValue);
        }
    }
}
