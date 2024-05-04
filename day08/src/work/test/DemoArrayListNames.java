package work.test;

import work.entity.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author 30391
 */
public class DemoArrayListNames {
    public static void main(String[] args) {
        Person person = new Person();


        List<String> one = new ArrayList<>();
        one.add("陈玄风");
        one.add("梅超风");
        one.add("陆乘风");
        one.add("曲灵风");
        one.add("武眠风");
        one.add("冯默风");
        one.add("罗玉风");
        List<String> two = new ArrayList<>();
        two.add("宋远桥");
        two.add("张三丰");
        two.add("俞岱岩");
        two.add("张松溪");
        two.add("张翠山");
        two.add("殷梨亭");
        two.add("莫声谷");

        System.out.println("1 " + Arrays.toString(one.stream()
                .filter(s -> s.length() == 3)
                .toArray()));

        System.out.println("2 " + Arrays.toString(one.stream()
                .limit(3)
                .toArray()));

        System.out.println("3 " + Arrays.toString(two.stream()
                .filter(s -> s.startsWith("张"))
                .toArray()));

        System.out.println("4 " + Arrays.toString(two.stream()
                .skip(2)
                .toArray()));

        Stream<String> oneStream = one.stream();
        Stream<String> twoStream = two.stream();
        System.out.println("5 " + Arrays.toString(Stream.concat(oneStream, twoStream).toArray()));

        Stream<String> thereStream = one.stream();
        Stream<String> fourStream = two.stream();
        Stream.concat(thereStream, fourStream)
                .map(s -> {
                    person.setName(s);
                    return person;
                })
                .forEach(System.out::println);


    }


}
