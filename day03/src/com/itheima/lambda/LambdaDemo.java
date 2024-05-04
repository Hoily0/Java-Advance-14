package com.itheima.lambda;

public class LambdaDemo {
    /*
        Lambda表达式: JDK8出现的一种新的语法格式
        作用: 进一步的简化匿名内部类的书写格式
        格式: () -> {}

        语法糖: 实现原理不变, 代码格式更加简洁
        问题: Lambda表达式是否是匿名内部类的语法糖?
        回答: 不是


        注意事项: Lambda表达式只能简化函数式接口所编写的匿名内部类

                    思路: 调用方法, 形参是接口, 需要传入接口的实现类对象

                            选择方向:

                            1. 手动编写一个新的实现类      : 方法很多
                            2. 匿名内部类                : 方法较少(1~2)
                            3. Lambda表达式             : 方法只有一个

        ---------------------------------------------
        Lambda的学习路径 :

            1. 知道Lambda的作用          √
            2. 掌握Lambda的书写格式       √
            3. 学习Lambda表达式的省略语法
            4. Lambda和匿名内部的区别
     */
    public static void main(String[] args) {

        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类的show方法...");
            }
        });

        useInter(() -> System.out.println("Lambda表达式的show方法..."));

    }

    public static void useInter(Inter i) {
        i.show();
    }
}


interface Inter {
    void show();
}