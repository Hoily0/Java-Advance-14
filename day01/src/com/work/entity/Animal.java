package com.work.entity;

public class Animal {

    protected void makeSounds() {
        System.out.println("制造声音");
    }

    public void move(int distance) {
        System.out.println("移动了" + distance + "米");
    }
}
