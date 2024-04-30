package work;

import com.itheima.arrays.BubbleSort;

import javax.lang.model.element.NestingKind;
import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {


        int[] arrCopy = {314, 3, 54, 89, 0, 29, 57, 19, 21, 48, 99, 7, 61};
        int[] arr = {314, 3, 54, 89, 0, 29, 57, 19, 21, 48, 99, 7, 61};

//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
//
//        System.out.println("Arrays.binarySearch(arr ,19) = " + Arrays.binarySearch(arr, 99));

//        Arrays.sort(arr);
//
////        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
//
//
//        int[] reverse = new int[arr.length];
//        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
//            reverse[j] = arr[i];
//        }
//        System.out.println("Arrays.binarySearch(reverse, 89) = " + Arrays.binarySearch(reverse, 89));
//        // 打印反转后的数组
//        System.out.println("Reversed Array: " + Arrays.toString(reverse));


//        System.out.println("Arrays.equals(arr, arrCopy) = " + Arrays.equals(arr, arrCopy));
        bubbleSort(arr);
        binarySearch(arr, 43124);

//        binarySearch(arr, 314);int[] arr = {314, 3, 54, 89, 0, 29, 57, 19, 21, 48, 99, 7, 61};

    }


    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }

            }
            if (!flag) {
                break;
            }
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }


    public static void binarySearch(int[] arr, int key) {
        int min = 0;
        int max = arr.length - 1;
        int count = 0;
        boolean found = false;

        while (min <= max) {
            int mid = min + (max - min) / 2; // 计算中间位置

            if (arr[mid] == key) {
                System.out.println("Key " + key + " found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < key) {
                min = mid + 1; // 更新搜索范围到右半部分
            } else {
                max = mid - 1; // 更新搜索范围到左半部分
            }

            count++; // 记录查找次数
        }

        System.out.println("循环次数 " + count);

        if (!found) {
            System.out.println("Key " + key + " 未找到");
        }
    }


}

