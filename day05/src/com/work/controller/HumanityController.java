package com.work.controller;

import com.work.entity.Humanity;
import com.work.entity.Manager;
import com.work.enumerate.HumanGender;

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

        int max = list.get(1).getHeight(), min = list.get(1).getHeight();
        String maxName = "", minName = "";
        for (Humanity humanity : list) {
            if (humanity.getHeight() > max) {
                max = humanity.getHeight();
                maxName = humanity.getName();

            }
            if (humanity.getHeight() < min) {
                min = humanity.getHeight();
                minName = humanity.getName();
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(maxName);
        System.out.println(minName);
//        humanityFive.getName(HumanGender.WALMART_SHOPPING_BAG);

    }

}
