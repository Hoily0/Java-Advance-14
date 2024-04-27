package com.itheima.demo6_generic.d2_generic_interface;

public class Test {
    public static void main(String[] args) {
        // 创建MyListImp实现类对象
        MyListImp imp1 = new MyListImp();
        imp1.add("szitheima666");
        imp1.show("szitheimajava");

        // 创建MyListImp实现类对象,指定泛型的具体数据类型
        MyListImp2<Integer> imp2 = new MyListImp2<>();
        imp2.add(1000);
        imp2.show(2000);
    }

}
