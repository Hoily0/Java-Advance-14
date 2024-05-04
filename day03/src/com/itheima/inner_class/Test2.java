package com.itheima.inner_class;

public class Test2 {
    public static void main(String[] args) {
        MyOuter.Inner oi = new MyOuter.Inner();
        oi.show();

        MyOuter.Inner.print();
    }
}

class MyOuter {

    int num = 10;

    static class Inner {

        public void show() {
            System.out.println("Inner..show...");
        }

        public static void print() {
            System.out.println("Inner...static...print");
        }

        public void method() {
            // 非静态的成员, 需要创建对象才能使用
            MyOuter mo = new MyOuter();
            System.out.println(mo.num);
        }

    }

}
