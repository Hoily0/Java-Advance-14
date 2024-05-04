package com.itheima.lambda.test;

import java.util.Random;

public class LambdaTest3 {
    public static void main(String[] args) {

        useRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                return new Random().nextInt(100);
            }
        });

        useRandomNumHandler(() -> new Random().nextInt(100));

    }

    /*
         RandomNumHandler randomNumHandler = new RandomNumHandler() {
            @Override
            public int getNumber() {
                return new Random().nextInt(100);
            }
         };

         int result = randomNumHandler.getNumber();
         System.out.println(result);
     */

    public static void useRandomNumHandler(RandomNumHandler randomNumHandler) {
        int result = randomNumHandler.getNumber();
        System.out.println(result);
    }
}

interface RandomNumHandler {
    int getNumber();
}
