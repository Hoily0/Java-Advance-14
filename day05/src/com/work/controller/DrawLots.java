package com.work.controller;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author 30391
 */
public class DrawLots {
    public static void main(String[] args) {

        ArrayList<String> gameList = new ArrayList<>();
        ArrayList<String> human = new ArrayList<>();

        gameList.add("学羊叫5声");
        gameList.add("蛙跳10下");
        gameList.add("吃芥末");
        gameList.add("喝一杯啤酒");
        gameList.add("做10个俯卧撑");

        human.add("甲");
        human.add("乙");
        human.add("丙");
        human.add("丁");
        human.add("戊");

        Random random = new Random();
        int index = 0;
        for (String gameStr : gameList) {
            index = random.nextInt(human.size());
            String string = human.get(index) + "抓到了" + gameStr;
            human.remove(index);


            System.out.println(string);

        }

    }
}
