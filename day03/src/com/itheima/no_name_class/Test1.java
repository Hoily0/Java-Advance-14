package com.itheima.no_name_class;

public class Test1 {
    /*
        匿名内部类 :

            前提 : 需要先有一个类, 或者是接口
            介绍 : 本质来讲就是一个特殊的局部内部类 (方法中编写)
            作用 : 可以将实现接口, 重写方法, 创建实现类对象, 这三个步骤, 使用一步完成.

            格式 :
                    new 类名() {}   --> 继承这个类
                    new 接口名() {}  --> 实现了这个接口


            复盘 : 我们调用一个参数的接口的方法, 做了哪些步骤
                    1. 编写实现类, 实现接口
                    2. 重写接口的抽象方法
                    3. 创建实现类对象, 并传入方法.
     */
    public static void main(String[] args) {
        // 问题: 方法形参, 跟我要的是接口, 我该给什么?
        // 回答: 实现类对象
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类重写的show方法");
            }
        });

    }

    /*
        模拟: 你将来调用别人写好的方法, 别人的方法形参是接口
     */
    public static void useInter(Inter i) {          // Inter i = new Inter() {
        //    @Override
        //    public void show() {
        //        System.out.println("匿名内部类重写的show方法");
        //    }
        // }

        i.show();
    }

}


interface Inter {
    void show();
}

class InterImpl implements Inter {
    @Override
    public void show() {
        System.out.println("实现类重写后的show方法...");
    }
}