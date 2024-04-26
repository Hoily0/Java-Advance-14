package com.itheima.demo07_singleton_design_pattern;

public class TestA {
    public static void main(String[] args) {
        A a1 = A.getA();
        System.out.println(a1);

        System.out.println("**********************");

        A a2 = A.getA();
        System.out.println(a2);

    }
}
