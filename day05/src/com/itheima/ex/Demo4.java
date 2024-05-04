package com.itheima.ex;

/*
    异常处理方式二：抛
    （推荐）异常处理方式三：子方法中抛出异常（默认），在总方法调用处统一捕获异常，进行处理。少写try  catch
    throws抛出异常方式（默认）
 */
public class Demo4 {

    public static void main(String[] args) {
        try {
            run();
            show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }

    private static void show() {
        String s = null;
        s.length();
        System.out.println("123");
        System.out.println("123");
        System.out.println("123");
    }

    private static void run() {
        int i = 1 / 0;
        System.out.println("345");
        System.out.println("345");
        System.out.println("345");
    }
}
