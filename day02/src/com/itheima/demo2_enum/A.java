package com.itheima.demo2_enum;

public enum A {
    X, Y, Z;

    // 枚举中的其他成员: 成员变量,成员方法,构造器,...
    int num;

    public void show() {
        System.out.println("A枚举中的show方法...");
    }

    // 注意: 枚举类中的构造器必须是私有的
    private A() {

    }

}
