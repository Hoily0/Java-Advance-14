package com.itheima.demo09_inherit_exercise;

/**
 * 咨询师
 */
public class Consultant extends People {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void printInfo() {
        System.out.println(getName() + "服务了" + number + "人数");
    }
}
