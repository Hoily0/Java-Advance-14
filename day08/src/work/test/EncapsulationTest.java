package work.test;

import work.entity.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 30391
 */
public class EncapsulationTest {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        Collections.addAll(name, "王佳乐", "张三丰", "王思聪", "张飞");

        Person person = new Person();

        Stream<Person> personStream = name.stream().map(s -> {
            person.setName(s);
            return new Person(s);
        });
//        personStream.forEach(System.out::println);

        System.out.println(personStream.collect(Collectors.toList()));


    }
}
