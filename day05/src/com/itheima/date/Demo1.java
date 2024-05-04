package com.itheima.date;

import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        //1.无参构造，创建当前时间
        Date date1 = new Date();
        //2.有参构造，传入指定的毫秒值，得到指定时间（毫秒值从1970年时间原点开始算的）
        Date date2 = new Date(-1000000000000L);
        System.out.println(date1);
        System.out.println(date2);//时间原点，为什么是8点，因为我们是东八区

        //3.获取一个时间对象的毫秒数
        long time1 = date1.getTime();
        //4.重新设置时间
        date1.setTime(0);
        System.out.println(time1);//当前时间的毫秒值
        System.out.println(date1);//修改之后的时间对象 Thu Jan 01 08:00:00 CST 1970
    }
}
