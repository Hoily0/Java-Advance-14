package com.work.entity;

public class HungryChineseSingleton {

    private static final HungryChineseSingleton hungryChineseSingleton = new HungryChineseSingleton();//直接创建

    private HungryChineseSingleton() {
        //无法使用构造器创建
    }

    public static HungryChineseSingleton getObject() {
        return hungryChineseSingleton;
    }
}
