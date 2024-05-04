package com.work.test;

import com.work.entity.Phone;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.sendMessage();
        phone.call();
        phone.playGame();
    }
}
