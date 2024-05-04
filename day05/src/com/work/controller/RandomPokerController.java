package com.work.controller;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 30391
 */
public class RandomPokerController {
    private static void playCards() {
        ArrayList<String> tomList = new ArrayList<>();
        ArrayList<String> jerryList = new ArrayList<>();
        ArrayList<String> roseList = new ArrayList<>();

        // 获取洗牌后的牌组
        ArrayList<String> shuffledCards = shuffle();

        // 发牌给三位玩家，每人发17张牌
        for (int i = 0; i < shuffledCards.size(); i++) {
            if (i % 3 == 0 && tomList.size() < 17) {
                tomList.add(shuffledCards.get(i)); // 发给Tom
            } else if (i % 3 == 1 && jerryList.size() < 17) {
                jerryList.add(shuffledCards.get(i)); // 发给Jerry
            } else if (i % 3 == 2 && roseList.size() < 17) {
                roseList.add(shuffledCards.get(i)); // 发给Rose
            }
        }

        // 打印每位玩家手中的牌
        System.out.println("Tom's cards: " + tomList);
        System.out.println("Jerry's cards: " + jerryList);
        System.out.println("Rose's cards: " + roseList);

        // 获取剩余的牌
        shuffledCards.removeAll(tomList); // 移除Tom手中的牌
        shuffledCards.removeAll(jerryList); // 移除Jerry手中的牌
        shuffledCards.removeAll(roseList); // 移除Rose手中的牌

        // 打印剩余的牌
        System.out.println("Remaining cards: " + shuffledCards);
    }

    private static ArrayList<String> shuffle() {
        String[] card = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        String[] color = {"♠", "♥", "♣", "♦"};
        ArrayList<String> list = new ArrayList<>();

        for (String iCard : card) {
            for (String iColor : color) {
                String resultCard = iColor + iCard;
                list.add(resultCard);
            }
        }

        list.add("King");
        list.add("king");
        Collections.shuffle(list); // 洗牌

        return list;
    }

    public static void main(String[] args) {
        playCards(); // 调用发牌方法
    }
}
