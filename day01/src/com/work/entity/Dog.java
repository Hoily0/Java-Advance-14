package com.work.entity;

public class Dog extends Animal {
    @Override
    protected void makeSounds() {
        System.out.println("发出了狗叫");

    }

    @Override
    public void move(int distance) {
        System.out.println("狗移动了" + distance + "米");
    }
}
