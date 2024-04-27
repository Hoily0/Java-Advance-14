package com.itheima.demo6_generic.d3_generic_method;

public class Test {

    public static void main(String[] args) {
        // 调用test方法
        String rs = test("szitheima");
        System.out.println("rs = " + rs);

        System.out.println("---------");

        Integer rs2 = test(100);
        System.out.println("rs2 = " + rs2);

        System.out.println("---------");
        Object obj = get();
        System.out.println("obj = " + obj);
        String s = (String) obj;
        System.out.println("s = " + s);

        String rs3 = get();
        System.out.println("rs3 = " + rs3);
    }

    // 泛型方法是在调用的时候确定其泛型的具体数据类型
    // 定义一个含有泛型的方法
    public static <T> T test(T t) {
        System.out.println("t = " + t);
        return t;
    }

    public static <R> R get() {
        return (R) "szitheimajava";
    }

}
