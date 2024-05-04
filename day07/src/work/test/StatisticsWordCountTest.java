package work.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 30391
 */

//需求 :  利用键盘录入，输入一个字符串,统计该字符串中各个字符的数量
//
//        - 打印出每个字符串出现的数量
//        - 例如：“一棵柳树扭一扭”

public class StatisticsWordCountTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.next().split("");
        Map<String, Integer> count = new HashMap<>();
        for (String s : str) {
            if (count.containsKey(s)) {
                Integer integer = count.get(s);
                integer++;
                count.put(s, integer);
            } else {
                count.put(s, 1);
            }
        }
        System.out.println("count = " + count);
    }
}
