package com.classroom;

import java.lang.management.ManagementFactory;

public class Lambda {
    public static void main(String[] args) {
        Eating eating = new Eating() {
            @Override
            public void eat() {
                System.out.println("吃饭");
            }
        };

        Eating eating1 = () -> {
            System.out.println("吃饭");
        };
        eating.eat();
        eating1.eat();


        Inter1 inter1 = (name, age) -> {
            System.out.println(name + " " + age);
        };
        inter1.show("列奥", 13);


        Inter2 inter2 = (name) -> {
            System.out.println(name);
            Inter2 inter21 = System.out::println;
        };
        inter2.show("feasfeas");


        Inter3 inter3 = (a, b) -> {
            return Math.max(a, b);
        };
        int result = inter3.max(5, 89);
        System.out.println(result);


        Inter3 inter31 = Math::min;
        double max = inter31.max(43124312, 41324312);
        System.out.println(max);


    }
}

@FunctionalInterface
interface Eating {
    void eat();
}

@FunctionalInterface
interface Inter1 {
    void show(String name, int age);
}

@FunctionalInterface
interface Inter2 {
    void show(String name);
}

@FunctionalInterface
interface Inter3 {
    int max(int a, int b);
}