package com.itheima._homework.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
   键盘录入一个时间字符串
   要求格式：yyyy-MM-dd  yyyy年MM月dd日
   字符串解析成时间对象

    编译时异常：悲观，编译时报错
    运行时异常：乐观，编译时不报错，运行时才报错
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日（格式例如2020-11-11或者2020年11月11日）：");
        String next = sc.next();
        //解析成时间对象
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy年MM月dd日");
        //1.先使用格式化对象1解析
        Date date = null;
        try {
            date = dateFormat1.parse(next);
        } catch (ParseException e) {
            //2.如果第一次解析报错了，则使用格式化对象2解析
            try {
                date = dateFormat2.parse(next);
            } catch (ParseException ex) {
                ex.printStackTrace();//打印异常信息，但不会停止程序
                System.out.println("请输入正确日期格式");
            }
        }

        System.out.println(date);

    }
}
