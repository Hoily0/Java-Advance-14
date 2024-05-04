package com.itheima.object;

import java.util.ArrayList;

public class ObjectDemo1 {
    /*
        Object类的介绍 : 所有的类都直接或者间接的继承了Object类, 是所有类的祖宗
                - 思路 : 该类中所具备的方法, 所有的对象, 包括数组都可以使用


        今天的学习目标:
                1. public String toString() : 返回该对象的字符串表示

                        - 打印对象名的时候, println方法, 内部会自动调用该对象的toString()

                        - Object类中toString方法的逻辑 :

                                public String toString() {
                                    return getClass().getName() + "@" + Integer.toHexString(hashCode());
                                }

                                getClass().getName() : 获取类的全类名
                                "@" : 分隔符
                                Integer.toHexString(hashCode()) : 将传入的参数, 转换为十六进制
                                hashCode() : 返回的是一个对象的哈希值 (目前的理解: 返回的就是对象的一个整数表示形式)

                                重点理解: Object类的toString方法, 默认逻辑没有太多的意义
                                            - 作为子类, 一般都要重写Object类的toString方法.
                                            - 让toString方法, 展示对象的信息, 方便我们今后的调试

                        - 思路: 如果今后打印对象名, 看到的不是地址, 而是带有某种格式的内容, 说明这个类, 肯定重写通过toString方法

                2. public boolean equals(Object obj) :
     */
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("张三", 23));
        list.add(new Student("李四", 24));
        list.add(new Student("王五", 25));

        System.out.println(list);

    }
}

