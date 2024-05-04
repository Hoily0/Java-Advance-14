package com.itheima.date;

import java.time.*;

/*
    LocalDate：年月日
    LocalTime:时分秒
    LocalDateTime:年月日时分秒
 */
public class Demo4 {
    public static void main(String[] args) {
        //1.获取当前时间 now()
        LocalDate now1 = LocalDate.now();
        LocalTime now2 = LocalTime.now();
        LocalDateTime now3 = LocalDateTime.now();
        System.out.println(now1);//2024-05-03
        System.out.println(now2);//14:40:28.014153200
        System.out.println(now3);//2024-05-03T14:40:28.014153200
        //2.获取指定时间 of()
        LocalDate date1 = LocalDate.of(2002, 12, 12);
        LocalTime date2 = LocalTime.of(18, 30, 0);
        LocalDateTime date3 = LocalDateTime.of(2024, 9, 30, 18, 30, 0);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println("---------------------------------------------------");
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        Month month = now.getMonth();
        int monthValue = now.getMonthValue();
        int dayOfMonth = now.getDayOfMonth();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        System.out.println(year);
        System.out.println(month);
        System.out.println(monthValue);
        System.out.println(dayOfMonth);
        System.out.println(dayOfWeek);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println("-----------------------");
        System.out.println(now);
        //修改
        LocalDateTime d1 = now.withHour(18);
        System.out.println(d1);
        LocalDateTime d2 = d1.withMinute(30);
        System.out.println(d2);
        //添加
        LocalDateTime d3 = now.plusHours(10);
        System.out.println(d3);
        LocalDateTime d4 = now.plusDays(10);
        System.out.println(d4);
        LocalDateTime d5 = now.plusDays(-10);
        System.out.println(d5);
        //对比两个时间
        LocalDate d6 = LocalDate.of(2024, 10, 1);
        LocalDate d7 = LocalDate.of(2024, 10, 2);
        System.out.println(d6.equals(d7));//比较量时间是否相等
        System.out.println(d6.isBefore(d7));//d6是不是要在d7的前面
        System.out.println(d6.isAfter(d7));//d6是不是在d7的后面
        //转换
        LocalDate localDate = now.toLocalDate();
        LocalTime localTime = now.toLocalTime();
        System.out.println(localDate);
        System.out.println(localTime);
    }
}
