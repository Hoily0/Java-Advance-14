package com.itheima.demo09_inherit_exercise;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("老王");
        t.setSkill("编程能力");
        t.printInfo();
        System.out.println("----------------------------");
        Consultant c = new Consultant();
        c.setName("小红");
        c.setNumber(100);
        c.printInfo();
    }
}
