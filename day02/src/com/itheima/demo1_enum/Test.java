package com.itheima.demo1_enum;

public class Test {
    public static void main(String[] args) {
        /*
            1.枚举也是一种引用数据类型,可以定义枚举类型的变量
            2.枚举类型的变量,只能赋该枚举类型中的枚举值
            3.枚举一般是用来描述只有固定个数值的类型
                例如: 性别,季节,方向,...
         */
        // 需求: 定义一个A枚举类型的变量,并赋值
        A a = A.X;
        System.out.println("a = " + a);// X

        //String sex = "abcd";

        // 需求: 定义一个Sex枚举类型的变量表示性别,并赋值
        Sex sex = Sex.BOY;
        System.out.println("sex = " + sex);// BOY

        // 需求: 定义一个变量表示季节,并赋值
        Season season = Season.SUMMER;
        System.out.println("season = " + season);// SUMMER

        // switch语句判断
        switch (season) {
            case SPRING:
                System.out.println("春天...");
                break;
            case SUMMER:
                System.out.println("夏天....");
                break;
            case AUTUMN:
                System.out.println("秋天...");
                break;
            case WINTER:
                System.out.println("冬天...");
                break;
        }
    }
}
