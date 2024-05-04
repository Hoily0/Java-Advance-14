package online.test;

import java.util.*;

/**
 * @author 30391
 */
public class TreeSetTest {

    public static void main(String[] args) {

        Integer[] ints = {1, 3, 5, 6, 2, 9, 6, 1234, 898, 6254, 132, 456, 123, 341, 78, 43, 9, 1234};
        HashSet<Integer> integers = new HashSet<>(List.of(Integer.valueOf(Arrays.toString(ints))));
        Collections.addAll(integers, ints);
        System.out.println("integers = " + integers);
    }
}
