package work;

import java.util.Arrays;

public class SystemTest {

    public static void main(String[] args) {
//        systemExit();

        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());//自1970年1月1日开始经过微秒

        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] copyArr = new int[arr.length];

        System.arraycopy(arr, 1, copyArr, 0, 5);
        System.out.println(Arrays.toString(copyArr));

    }

    private static void systemExit() {
        int count = 0;
        while (true) {
            System.out.println("++");
            count++;
            if (count > 20) {
                System.exit(0);
            }
        }
    }
}
