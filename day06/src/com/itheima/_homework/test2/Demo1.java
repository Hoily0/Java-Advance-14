package com.itheima._homework.test2;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student tom = new Student("tom", 10, 90);
        Student jerry = new Student("jerry", 11, 91);
        Student tommy = new Student("tommy", 12, 89);
        Student jason = new Student("jason", 13, 78);
        Student rose = new Student("rose", 10, 80);
        list.add(tom);
        list.add(jerry);
        list.add(tommy);
        list.add(jason);
        list.add(rose);
        int sum = 0;
        double avg = 0;
        int max = list.get(0).getScore();//默认设置集合第一个元素为最高分
        int min = list.get(0).getScore();//默认设置集合第一个元素为最低分
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            int score = student.getScore();
            //总分
            sum += score;
            //最高分
            max = score > max ? score : max;
            //最低分
            min = score < min ? score : min;
        }
        //求平均分
        avg = 1.0 * sum / list.size();
        System.out.println("总分：" + sum);
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("平均分：" + avg);

    }
}
