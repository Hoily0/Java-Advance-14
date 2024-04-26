package com.itheima.demo07_singleton_design_pattern;

public class TestB {
    public static void main(String[] args) {
        B b1 = B.getB();
        System.out.println(b1);
        B b2 = B.getB();
        System.out.println(b2);
    }
}
