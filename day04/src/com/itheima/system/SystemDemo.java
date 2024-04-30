package com.itheima.system;


public class SystemDemo {
    /*
        System.currentTimeMillis() : 获取时间原点到现在所经历过的毫秒值
                1. 计算程序的执行效率
                2. 作为时间戳 (不太严谨)
currentTimeMillis
        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)  : 数组拷贝

                参数1: 数据源
                参数2: 拷贝的起始索引
                参数3: 数据目的
                参数4: 目标数组的起始索引位置
                参数5: 拷贝的个数
     */
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55};
        int[] newArr = new int[3];

        // 33 44 55
        System.arraycopy(arr, 2, newArr, 0, 3);

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }
}
