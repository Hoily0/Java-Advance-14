package com.itheima.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    案例一：
    键盘录入你的生日： 1977年08月19日
    您出生了： 19822天

    案例二：
    把字符串 “1999年12月12日 12时12分12秒”  转换成 “1999-12-12 12:12:12” 并打印测试;
 */
public class Demo3 {
    public static void main(String[] args) throws ParseException {
        String s1 = "1999年12月12日 12时12分12秒";
        //1.把字符串转成date对象
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = simpleDateFormat1.parse(s1);
        //2.把date对象转成字符串
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s2 = simpleDateFormat2.format(date);
        System.out.println(s2);
    }

    private static void method1() throws ParseException {
        //1.键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期:");
        String birthdayStr = sc.next();
        //2.把字符串转换成日期对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthday = simpleDateFormat.parse(birthdayStr);//编译时异常
        //3.获取这个日期对象的毫秒数
        long birthdayTime = birthday.getTime();
        //4.创建当前时间对象，使用当前时间对象的毫秒数-录入日期毫秒数得到差值，把差值转换成天。
        Date now = new Date();
        long nowTime = now.getTime();
        long d = (nowTime - birthdayTime) / 1000 / 60 / 60 / 24;
        System.out.println("您出生了" + d + "天");
    }
}
