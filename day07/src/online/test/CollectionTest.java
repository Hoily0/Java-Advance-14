package online.test;

import jdk.jfr.FlightRecorderListener;
import work.entity.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author 30391
 */
public class CollectionTest {
    public static void main(String[] args) {

        Integer[] nums = {-234, 3415, -513253132, 5312521, -1553, 6834, -34, 65, 65, 65, 65, 65, 65, 65, 5576, 121, 1000000, -9};

        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, nums);

//        int[] arr = {12, 341, 543, 7645, 1, 6534, 122, 78};
//        Stream<Integer> stream1 = list.stream();
//        Stream<Integer> stream2 = Arrays.stream(arr).boxed();
//
//        Stream.concat(stream1,stream2).forEach(System.out::println);


//
//        System.out.println(Arrays.toString(list.stream().filter(i -> Math.abs(i) > 500).toArray()));
//
//        System.out.println("Arrays.toString(list.stream().filter(s -> Math.abs(s) > 1000).filter(s -> s > 0).filter(s ->  s % 10 == 0).toArray()) = " + Arrays.toString(list.stream().filter(s -> Math.abs(s) > 1000).filter(s -> s > 0).filter(s -> s % 10 == 0).toArray()));
////        list.stream().sorted().forEach(System.out::println);

//        list.stream().filter(integer -> Math.abs(integer) < 500000).sorted().forEach(System.out::println);

//        list.stream().filter(e -> Math.abs(e) < 500000).sorted(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        }).forEach(System.out::println);

//        list.stream().filter(e -> Math.abs(e) < 100000).sorted((o1, o2) -> o2 - o1).forEach(System.out::println);


//        list.stream().filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return Math.abs(integer) > 500;
//            }
//        }).sorted(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        }).limit(3).forEach(System.out::println);


//        list.stream().filter(e -> Math.abs(e) < 1000000).sorted((o1, o2) -> o2 -o1).limit(3).forEach(System.out::println);
//        System.out.println("-------");
//        list.stream().filter(e ->Math.abs(e) < 10000).sorted((o1, o2) -> o2 -o1).skip(4).forEach(System.out::println);
//        System.out.println("----------------------------");
//        list.stream().filter(e -> Math.abs(e) < 100000).sorted((o1, o2) -> o2 -o1).distinct().limit(nums.length - 5).forEach(System.out::println);
//        System.out.println("==============Map===============");
        list.stream().sorted((o1, o2) -> o2 - o1).distinct().map(e -> (e % 2 == 0 ? "偶数" : "奇数")).forEach(System.out::println);
        long count = list.stream().sorted((o1, o2) -> o2 - o1).distinct().map(e -> (e % 2 == 0 ? "偶数" : "奇数")).count();
        System.out.println(count);

//        list.stream().map(new Function<Integer, Integer>() {

//            @Override
//            public Integer apply(Integer integer) {
//                return  integer % 2 ;
//            }
//        }).distinct().forEach(System.out::println);

//        list.stream().filter(new Predicate<Integer>() {

//            @Override
//            public boolean test(Integer integer) {
//                return integer.
//            }concat
//        })

//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println(list);
//
//        Collections.shuffle(list);
//        System.out.println("list = " + list);
//
//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        System.out.println(list);


    }
}

