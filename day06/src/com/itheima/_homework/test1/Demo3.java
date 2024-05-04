package com.itheima._homework.test1;

import java.util.ArrayList;
import java.util.Scanner;

/*
    需求 :  编写一个学生类,  属性为 :  姓名,  年龄,  数学成绩,  语文成绩,  英语成绩

    - 成绩不能为为负数, 不能大于100分
    - 年龄应控制在 0 ~ 120 之间
    - 创建3个学生对象, 并打印学生信息 (学生的信息, 都来自于键盘录入)
    - 如果出现异常, 给出提示, 并继续输入
    - 请结合自定义异常,  思考这道题的解法
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<>();
        //每次循环创建一个对象
        for (int i = 0; i < 3; i++) {
            Student stu = new Student();
            System.out.println("请输入姓名：");
            String name = sc.next();
            stu.setName(name);

            System.out.println("请输入年龄：");

            while (true) {
                int age = sc.nextInt();
                try {
                    stu.setAge(age);
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println("请重新输入年龄：");
                }
            }

            System.out.println("请输入数学成绩：");
            while (true) {
                int score1 = sc.nextInt();
                try {
                    stu.setMathScore(score1);
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println("请重新输入成绩:");
                }
            }
            System.out.println("请输入语文成绩：");

            while (true) {
                int score2 = sc.nextInt();
                try {
                    stu.setYuwenScore(score2);
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println("请重新输入成绩:");
                }
            }

            System.out.println("请输入英语成绩：");
            while (true) {
                int score3 = sc.nextInt();
                try {
                    stu.setEnglishScore(score3);
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println("请重新输入成绩:");
                }
            }
            //对象存储集合
            list.add(stu);
        }

        list.forEach(s -> System.out.println(s));
    }
}
