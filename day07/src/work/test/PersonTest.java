package work.test;

import work.entity.Person;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 30391
 */
public class PersonTest {
    public static void main(String[] args) {

        Person person1 = new Person("分爱上", 14);
        Person person2 = new Person("评分安徽江苏", 23);
        Person person3 = new Person("分奥", 8);
        Person person4 = new Person("富婆啊", 89);
        Person person5 = new Person("怕你发", 234);
        Person person6 = new Person("灭佛", 23489);
        Person person7 = new Person("vnzs", 9);


        List<Person> list = new ArrayList<>();
        Collections.addAll(list, person1, person2, person3, person4, person5, person6, person7);


        list.stream().map(Person::getAge).sorted().limit(5).distinct().forEach(System.out::println);
        list.stream().map(Person::getName).forEach(System.out::println);

//        list.stream().map(Person::getName).filter(e -> e.length() < 4).toArray(new IntFunction<? extends Object[]>() {
//        })

//        Set<Integer> set = list.stream().map(Person :: getAge).filter(e -> e < 500).collect(Collectors.toSet());
//        System.out.println(set);
//        List<String> collect = list.stream().map(Person::getName).collect(Collectors.toList());
//        System.out.println(collect);


//        Person personM = list.stream().max((o1, o2) -> o2.getAge() - o1.getAge()).get();
//        Person personN = list.stream().max(Person::compareTo).get();
//        System.out.println(personM);
//        System.out.println(personN);

        Map<Integer, String> collect = list.stream().collect(Collectors.toMap(new Function<Person, Integer>() {

            @Override
            public Integer apply(Person person) {
                return person.getAge();
            }
        }, new Function<Person, String>() {

            @Override
            public String apply(Person person) {
                return person.getName();
            }
        }));
        System.out.println(collect);

        Map<String, Person> collect1 = list.stream().collect(Collectors.toMap(s -> s.getName(), s -> s));
        System.out.println(collect1);


        Function<Person, String> function = new Function<>() {
            @Override
            public String apply(Person person) {
                return person.getName();
            }
        };
        Function<Person, Integer> function1 = new Function<>() {
            @Override
            public Integer apply(Person person) {
                return person.getAge();
            }
        };

        Map<String, Integer> collect2 = list.stream().collect(Collectors.toMap(function, function1));
        System.out.println(collect2);


    }
}
