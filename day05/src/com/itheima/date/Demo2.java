package com.itheima.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    SimpleDateFormat:完成日期对象的格式化
        1.把日期对象按照指定的格式 转成字符串
        2.解析指定格式的字符串为日期对象

    注意：掌握有参构造创建对象， 格式化方法和解析方法即可。
*/
public class Demo2 {
    public static void main(String[] args) throws ParseException {
        //无参构造
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();
        //有参构造
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //日期对象
        Date date = new Date();
        System.out.println(date);//Fri May 03 09:38:27 CST 2024
        //无参构造传进出来的格式化对象，默认格式：2024/5/3 上午9:37
        String dateStr1 = simpleDateFormat1.format(date);
        System.out.println(dateStr1);
        //有参构造创建出来的指定格式的对象，来格式化日期：2024-05-03 09:38:27
        String dateStr2 = simpleDateFormat2.format(date);
        System.out.println(dateStr2);
        System.out.println("---------------");
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String s = "2024年05月03日 09时40分50秒";
        //把以上子字符串转换成Date对象
        Date date2 = simpleDateFormat3.parse(s);
        System.out.println(date2);//Fri May 03 09:40:50 CST
    }
}
