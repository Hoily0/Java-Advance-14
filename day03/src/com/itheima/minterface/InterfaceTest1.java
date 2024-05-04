package com.itheima.minterface;

public class InterfaceTest1 {
    /*
        JDK8版本接口的改进 :

            1. 允许编写带有方法体的方法 (默认方法)
            2. 允许编写静态方法

            目的: 解决接口的升级问题

        -----------------------------------------------------

        注意事项:
            1. 接口中的静态方法, public可以省略 static不能省略
            2. 接口中的静态方法, 只允许接口名调用
            3. 接口中的默认方法, 可以被重写, 但是重写的时候, 需要去掉default关键字
            4. 接口中的默认方法, public可以省略 default不能省略
            5. 接口中允许编写方法逻辑了, 那么在多实现的时候, 多个接口中存在相同的默认方法, 逻辑却不一样, 这时候会出什么现象?
                        - 如果不处理, 就会出现编译错误
                        - 处理: 强制重写

     */
    public static void main(String[] args) {
        AInterImpl a = new AInterImpl();
        a.print();
        a.show();
        a.method();

        BInterImpl b = new BInterImpl();
        b.print();
        b.show();
        b.method();

    }
}

interface A {
    public default void show() {
        System.out.println("A...");
    }
}

interface B {
    public default void show() {
        System.out.println("B...");
    }
}

class ABImpl implements A, B {

    @Override
    public void show() {
        A.super.show();
        B.super.show();
        System.out.println("C...");
    }
}


interface Inter {
    void show();

    void print();

    default void method() {
        System.out.println("method...");
    }

    static void fun() {
        System.out.println("Fun...");
    }

}

class AInterImpl extends Object implements Inter {

    @Override
    public void show() {

    }

    @Override
    public void print() {

    }

    @Override
    public void method() {
        Inter.super.method();
    }
}

class BInterImpl implements Inter {

    @Override
    public void show() {

    }

    @Override
    public void print() {

    }
}