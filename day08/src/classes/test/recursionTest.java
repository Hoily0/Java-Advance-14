package classes.test;

import java.io.File;
import java.util.Scanner;

/**
 * @author 30391
 */
public class recursionTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int result = numberRecursion(scanner.nextInt());
        System.out.println(result);

        findRecursion();


    }

    private static void findRecursion() {
        File file = new File("D:\\");
        File[] files = file.listFiles();
        for (File fi : files) {
            if (fi.isFile()) {
                if ("QQ.exe".equals(fi.getName())) {
                    System.out.println("找到了");
                    System.out.println(fi.getAbsolutePath());
                    Runtime runtime = Runtime.getRuntime();

                } else {
                    break;
                }
            } else if (fi.isDirectory()) {
                File[] files1 = fi.listFiles();

            }
        }
    }

    private static int numberRecursion(int num) {
        if (num == 1) {
            return 1;
        }
        return numberRecursion(num - 1) * num;

    }

}
