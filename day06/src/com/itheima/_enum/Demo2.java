package com.itheima._enum;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(Gender2.MAN);
        System.out.println(Gender2.MAN.getName());
    }
}

//复杂枚举
enum Gender2 {
    //对象
    MAN("男"), WOMAN("女");
    private String name;

    private Gender2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}