package com.itheima._homework.test5;

import java.util.ArrayList;
import java.util.Random;

/*
一幅poker有 54 张牌。
大王 小王 A K Q J 10 9 8 7 6 5 4 3 2
除了大王小王以外 每种牌面：♠ ♥ ♣ ♦

1.根据上述素材代码，制作出一幅完整的扑克牌（ArrayList），并打印出扑克牌
2.编写发牌方法，调用方法传入扑克牌集合。方法中给tom、jerry、rose 三个人 随机发牌17张。
并打印三人的牌及剩下的3张底牌。
 */
public class Demo1 {
    public static void main(String[] args) {
        String[] pai = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        String[] huase = {"♠", "♥", "♣", "♦"};
        //1.制作扑克牌
        ArrayList<String> poker = new ArrayList<>();
        poker.add("大王");
        poker.add("小王");
        for (int i = 0; i < pai.length; i++) {
            for (int j = 0; j < huase.length; j++) {
                String s = huase[j];
                //花色+牌
                String s1 = pai[i] + huase[j];
                poker.add(s1);
            }
        }
        System.out.println("扑克牌：" + poker);

        method1(poker);
    }

    public static void method1(ArrayList<String> poker) {
        ArrayList<String> tom = new ArrayList<>();
        ArrayList<String> jerry = new ArrayList<>();
        ArrayList<String> rose = new ArrayList<>();
        //发牌：发一张，集合中就要少一张牌。发牌应该随机。
        Random random = new Random();
        for (int i = 0; i < 51; i++) {
            int randomIndex = random.nextInt(poker.size());
            String oldValue = poker.remove(randomIndex);
            if (i % 3 == 0) {
                tom.add(oldValue);
            }
            if (i % 3 == 1) {
                //jerry
                jerry.add(oldValue);
            }
            if (i % 3 == 2) {
                //给rose
                rose.add(oldValue);
            }
        }
        System.out.println("tom的牌:" + tom);
        System.out.println("jerry的牌:" + jerry);
        System.out.println("rose的牌:" + rose);
        System.out.println("底牌:" + poker);
    }
}
