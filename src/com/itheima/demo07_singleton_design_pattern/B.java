package com.itheima.demo07_singleton_design_pattern;

/**
 * 懒汉式单例：拿对象时，才开始创建对象。
 *      把类的构造器私有。
 *      在类中创建该类的唯一对象。
 *      提供一个公共的类方法，返回该唯一对象。
 */
public class B {
    //在类中创建该类的唯一对象
    private static B b;

    //把类的构造器私有
    private B(){}

    //提供一个公共的类方法，返回该唯一对象
    public static B getB(){
        if(b == null){
            System.out.println("创建B对象啦");
            b = new B();
        }
        return b;
    }

}
