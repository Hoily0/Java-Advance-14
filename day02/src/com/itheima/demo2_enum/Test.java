package com.itheima.demo2_enum;

public class Test {
    public static void main(String[] args) {
        A.X.num = 10;
        System.out.println("A.X.num = " + A.X.num);// 10

        A.X.show();//A枚举中的show方法...
    }
}
