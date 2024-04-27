package com.itheima.demo4_enum_usecase;

public class Test {
    public static void main(String[] args) {
        showBook(Sex.BOY);

        System.out.println("-------------");

        showBook(Sex.GIRL);
    }

    // 需求: 定义一个方法,根据性别显示对应的感兴趣的书籍
    public static void showBook(Sex sex) {
        // 判断
        switch (sex) {
            case BOY:
                System.out.println("斗破苍穹");
                System.out.println("斗罗大陆");
                System.out.println("完美世界");
                break;
            case GIRL:
                System.out.println("霸道总裁爱上我");
                System.out.println("校花贴身高手");
                break;
        }
    }

}
