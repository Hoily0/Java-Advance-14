package com.itheima.test;

public class IntegerTest1 {
    /*
        自动装箱的数值范围 -128~127
             ==号比较的结果就是true, 不在这个范围, 比较的结果就是false

        ----------------------------------------------------------------

        原理: 自动装箱, 会调用Integer.valueOf();

        前提需知: 数组中存储的对象, 如果把某一个索引位置对应的元素, 重复的取出了多次, 数据其实是同一份

        源代码: 拿到装箱的数据, 会进行范围的判断, 看是不是-128~127
                    是 : 不会创建新的对象, 而是从底层数组中, 取出一个现有的对象返回
                    不是 : 会创建一个新的 Integer 对象返回

                    IntegerCache.cache (内部缓存) : 这个数组中一共有256个创建好的Integer对象
                    Integer[] cache = {new Integer[-128], new Integer[-127] .... , new Integer[126], new Integer[127]};


        public static Integer valueOf(int i) {
            if (i >= -128 && i <= 127) {
                return IntegerCache.cache[255];
            }
            return new Integer(i);
        }

     */
    public static void main(String[] args) {

        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);

        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println(i3 == i4);

    }
}
