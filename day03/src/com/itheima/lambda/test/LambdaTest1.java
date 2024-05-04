package com.itheima.lambda.test;

public class LambdaTest1 {
    public static void main(String[] args) {

        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("匿名内部类show...");
            }
        });


        useShowHandler(() -> System.out.println("Lambda表达式show..."));

    }

    public static void useShowHandler(ShowHandler showHandler) {
        showHandler.show();
    }

}

@FunctionalInterface
interface ShowHandler {
    void show();
}