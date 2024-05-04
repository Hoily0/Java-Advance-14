package com.itheima.homework;

/*
需求 : 不死神兔 (斐波那契数列)
有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
假如兔子都不死，问第二十个月的兔子对数为多少？
1: 1
2: 1
3: 1     1
4: 1  1  1
5: 2  1  2
6: 3  2  3
1    1     2     3    5    8

求第4个月有多少对兔子
第4个月 = 第3个月+第2个月
         第3个月 = 第2个月 +第1个月
         第2个月 = 1;
         第1个月 = 1;

 */
public class Demo4 {
    public static void main(String[] args) {
        int sum = getSum(20);
        System.out.println(sum);
    }

    public static int getSum(int monthNum) {
        if (monthNum == 1 || monthNum == 2) {
            return 1;
        }
        return getSum(monthNum - 1) + getSum(monthNum - 2);
    }
}
