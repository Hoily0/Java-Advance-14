package com.work.utils;

import java.util.Random;

public class MyUtils {

    private MyUtils() {

    }

    public StringBuilder createCode() {

        String data = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm2345678910";
        StringBuilder stringBuilder = new StringBuilder();
        Random rd = new Random();

        for (int i = 0; i < 6; i++) {
            stringBuilder.append(data.charAt(rd.nextInt(data.length())));
        }


        return stringBuilder;
    }
}
