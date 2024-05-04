package com.itheima.inner_class;

public class Test3 {
    public static void main(String[] args) {
        A a = new A();
        a.print();
    }
}

class A {

    public void print() {

        class Inner {
            public void show() {
                System.out.println("show...");
            }
        }

        Inner i = new Inner();
        i.show();

    }

    public void method() {

        class Inner {
            public void show() {
                System.out.println("show...");
            }
        }

        Inner i = new Inner();
        i.show();

    }

}