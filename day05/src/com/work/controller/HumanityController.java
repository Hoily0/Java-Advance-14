package com.work.controller;

import com.work.entity.Humanity;
import com.work.entity.Manager;

import java.util.ArrayList;

/**
 * @author 30391
 */
public class HumanityController {
    public static void main(String[] args) {

        ArrayList<Humanity> list = new ArrayList<>();

        Humanity humanityOne = new Humanity("屁哦昂", 23, 86);
        Humanity humanityTwo = new Humanity("分爱上", 27, 77);
        Humanity humanityThere = new Humanity("啊是不能", 93, 0);
        Humanity humanityFour = new Humanity("弄i阿飞", 17, 9219);
        Humanity humanityFive = new Humanity("冯傲松", 35, 9);

        list.add(humanityOne);
        list.add(humanityTwo);
        list.add(humanityThere);
        list.add(humanityFour);
        list.add(humanityFive);

        int max = 0, min = 0;
        for (Humanity humanity : list) {
            if (humanity.getHeight() > max) {
                max = humanity.getHeight();
            }
            if (humanity.getHeight() < min) {
                min = humanity.getHeight();
            }
        }
        System.out.println(max);
        System.out.println(min);

    }

}
