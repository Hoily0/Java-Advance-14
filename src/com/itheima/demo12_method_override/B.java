package com.itheima.demo12_method_override;

/**
 * 什么是方法重写？
 * 子类重写一个与父类的方法名称、参数列表、返回值类型一样的方法，去覆盖父类的这个方法，这就是方法重写。
 * 注意：实例方法的访问，遵循就近原则,本类对象有用本类的,本类对象没有找父类的。
 */
public class B extends A {

    public void print1() {
        System.out.println("我是子类的print1方法");
    }

    public void print2(int a, int b) {
        System.out.println("我是子类的print2方法");
    }
}
