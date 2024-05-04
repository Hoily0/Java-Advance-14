package com.itheima.inner_class;

public class Test1 {
    /*
        内部类创建对象的格式:

                外部类名.内部类名 对象名 = new 外部类对象().new 内部类对象();

                问题: 内部类使用起来很麻烦, 为什么要学习内部类?
                回答: 今后翻看Java的源码, 肯多类都是内部类.

                内部类的成员访问特点 :

                    内部类访问外部类的成员, 可以直接访问, 包括私有
     */
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}

class Outer {

    private int num = 10;

    class Inner {

        int num = 20;

        public void show() {
            int num = 30;

            System.out.println(num);                    // 30
            System.out.println(this.num);               // 20
            System.out.println(Outer.this.num);         // 10
        }
    }

}
