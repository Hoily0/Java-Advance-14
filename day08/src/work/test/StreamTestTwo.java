package work.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @author 30391
 */
public class StreamTestTwo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "王佳乐", "张三丰", "王思聪",
                "张飞", "刘晓敏", "张靓颖", "王敏");

        title1(list);

        System.out.println("—————————— ——————————");

        title2(list);


    }

    private static void title2(ArrayList<String> list) {
        Stream<String> streamZhang = list.stream().filter(s -> s.startsWith("张"));
        Stream<String> streamWang = list.stream().filter(s -> s.startsWith("王"));

        Stream<String> concat = Stream.concat(streamZhang, streamWang);

        concat.forEach(System.out::println);
    }

    private static void title1(ArrayList<String> list) {
        list.stream().filter(s -> s.startsWith("张"))
                .limit(2)
                .forEach(System.out::println);

        list.stream().filter(s -> s.startsWith("王"))
                .skip(1)
                .forEach(System.out::println);
    }
}
