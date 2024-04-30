package com.itheima.integer;

import java.util.ArrayList;

public class IntegerDemo1 {
    /*
        包装类: 将基本数据类型包装为类, 成为引用数据类型
                    好处: 类中有方法, 我们可以调用方法直接解决问题

        包装类的学习路径 :

              * 重点学习 Integer 类, 其它的可以自学了

              1. 怎么包? (如何将基本数据类型,包装为引用数据类型)

                    手动装箱: 手动编写代码, 将基本数据类型包装为引用数据类型
                            Integer num = Integer.valueOf(基本数据类型);
                    自动装箱: 编译器会自动的调用valueOf方法, 将基本数据类型包装为引用数据类型
                            Integer num = 100;

                    -----------------------------------------------------

                    手动拆箱: 手动编写代码, 将引用数据类型的包装类, 转换为基本数据类型
                            int i = 包装类对象.intValue();
                    自动拆箱: 自动完成以上动作
                            int i = 包装类对象;


                    结论: 基本数据类型, 和对应的包装类, 是可以直接做运算的

              2. 怎么用?
     */
    public static void main(String[] args) {
        int i = 10;
        Integer i1 = 10;
        System.out.println("i1.getClass() = " + i1.getClass());
        String str = "3412414";
        System.out.println("str.getClass() = " + str.getClass());
        Integer integer = Integer.valueOf(i);
        System.out.println("integer.getClass() = " + integer.getClass());

        System.out.println(Integer.valueOf(str));
        int i2 = integer.intValue();


    }
}

