package com.work.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

/**
 * @author 30391
 */
public class DoubleColorBallController {
    public static void main(String[] args) {


        System.out.println("createFullBall() = " + createFullBall());

        winningResults(createFullBall());

//        winning(createFullBall(), winningResults(()));

    }

    private static void winning(ArrayList<Integer> arrayList, ArrayList<Integer> result) {

        while (true) {

            for (Integer integer : arrayList) {
                for (Integer i : result) {
                    if (i.equals(integer)) {
                        System.out.println("匹配成功");
                        break;
                    }
                }
            }
        }


    }

    private static void winningResults(ArrayList<Integer> arrayList) {

        Integer[] integers = {10, 12, 30, 16, 7, 17, 12};
        ArrayList<Integer> result = new ArrayList<>();
        Collections.addAll(result, integers);

        int redCount = 0, blueCount = 0;
        for (Integer integer : result) {
            for (Integer i : arrayList) {
                if (i.equals(integer) && i != 6) {
                    redCount++;
                }
                if (i.equals(integer) && i == 6) {
                    blueCount++;
                }

            }

        }
        System.out.println("redCount = " + redCount);
        System.out.println("blueCount = " + blueCount);

    }

    private static ArrayList<Integer> createFullBall() {

        ArrayList<Integer> arrayList = new ArrayList<>(createRedBall());
        Random randomBlueBall = new Random();

        arrayList.add(randomBlueBall.nextInt(15) + 1);

        return arrayList;

    }

    private static HashSet<Integer> createRedBall() {

        HashSet<Integer> redSet = new HashSet<>();
        Random randomRedBall = new Random();

        while (true) {
            if (redSet.size() < 6) {
                redSet.add(randomRedBall.nextInt(35) + 1);
            } else {
                break;
            }
        }
        return redSet;


    }


}
