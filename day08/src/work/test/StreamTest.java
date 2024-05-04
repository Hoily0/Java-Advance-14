package work.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author 30391
 */
public class StreamTest {
    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        Collections.addAll(name, "张三丰", "王思聪", "张飞", "刘晓敏", "张靓颖");

        System.out.println("-------1------");

        name.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        name.forEach(System.out::println);

        System.out.println("name = " + name);


        System.out.println("-------2------");
        //2.2
        name.stream().filter(s -> s.startsWith("张"))
                .forEach(System.out::println);


        System.out.println("-------3------");
        //2.3
        long count = name.stream()
                .filter(s -> s.startsWith("张"))
                .count();
        System.out.println(count);

    }
}
