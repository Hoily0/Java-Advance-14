package com.itheima.object.test2;

import java.util.Objects;

public class Test {
    /*
        Objects类 : 工具类

            public static boolean equals (Object a, Object b) : 两个对象做比较, 返回true, false
                    * 注意: 这个equals方法, 内部还需要依赖于, 我们自己重写equals方法, 才可以比较内容

                    * 问题: 这方法有啥好处啊?
                    * 回答: 内部带有非null判断, 可以避免一些不必要的空指针异常


                                        // Object a : p1
                                        // b : p2
                                        // a != null &&
                                        // 在做非null判断
            public static boolean equals(Object a, Object b) {
                return (a == b) || (a != null && a.equals(b));
            }


            public static boolean isNull (Object obj) : 判断传入的对象是否是 null
     */
    public static void main(String[] args) {

        Phone p1 = null;
        Phone p2 = new Phone("小米", 3999);

        System.out.println(Objects.equals(p1, p2));

    }
}
