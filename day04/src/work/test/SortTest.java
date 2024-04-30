package work.test;

import work.utils.ArrayUtils;

import java.util.Arrays;

/**
 * @author 30391
 */
public class SortTest {
    public static void main(String[] args) {
        int[] ints = {1, 353, 67, 0, 89, 43, 32, 12, 73, 199, 37};
        System.out.println("ArrayUtils.bubbleSort(ints) = " + Arrays.toString(ArrayUtils.bubbleSort(ints)));


        System.out.println("ArrayUtils.findBinary(ArrayUtils.bubbleSort(ints), 67) = " + ArrayUtils.findBinary(ArrayUtils.bubbleSort(ints), 3053));
    }
}
