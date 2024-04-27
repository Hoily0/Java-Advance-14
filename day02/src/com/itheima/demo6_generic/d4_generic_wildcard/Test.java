package com.itheima.demo6_generic.d4_generic_wildcard;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 泛型通配符: ?  表示一切类型
        // Integer继承Number,Number继承Object
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();

        method(list1);
        method(list2);
        method(list3);
        method(list4);

        //method1(list1);// 编译报错
        method1(list2);
        method1(list3);
        method1(list4);

        //method2(list1);// 编译报错
        method2(list2);
        method2(list3);
        //method2(list4);// 编译报错

        /*
            注意: 泛型没有多态
         */
        //ArrayList<Object> list = new ArrayList<String>();// 编译报错
    }

    // 使用场景: 常用于形参中,限制要接收的实参泛型的范围
    // 需求: 定义一个方法,接收ArrayList集合,但泛型类型必须是Number类型或者Number的子类类型
    public static void method2(ArrayList<? extends Number> list) {// 接收的集合泛型只能是Number类型或者Number的子类类型

    }

    // 需求: 定义一个方法,接收ArrayList集合,但泛型类型必须是Integer或者Integer类的父类类型
    public static void method1(ArrayList<? super Integer> list) {// 接收的集合泛型只能是Integer类型或者Integer的父类类型

    }

    // 需求: 定义一个方法,接收任意泛型的ArrayList集合对象
    public static void method(ArrayList<?> list) {// 接收的集合泛型可以是任意类型

    }
}
