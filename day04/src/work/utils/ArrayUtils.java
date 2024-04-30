package work.utils;

public class ArrayUtils {


    public static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }
            }

        }
        return nums;

    }


    public static int findBinary(int[] nums, int key) {
        int min = 0, max = nums.length, mid = 0;
        while (min <= max) {
            mid = (max + min) / 2;
            if (key == nums[mid]) {
                System.out.println("已找到" + mid);
                break;
            } else if (key > nums[mid]) {
                min = mid;

            } else if (key < nums[mid]) {
                max = mid;
            }
            if (min == max) {
                System.out.println("没有找到");
                break;
            }

        }

        return mid;
    }
}
