package work.test;

import java.io.File;

/**
 * @author 30391
 */
public class FileTest {
    public static void main(String[] args) {

//        workOne();
        workTwo();
    }

    private static void workTwo() {

        File file1 = new File("work1.txt");
        File file2 = new File("C:\\Users\\work2");
        File file3 = new File("C:\\Users\\30391\\Desktop\\work3.txt");

        if (!file1.exists()) {
            new File("work1.txt");
        }
        if (!file2.exists()) {
            new File("C:\\Users\\work2");
        }
        if (!file3.exists()) {
            new File("C:\\Users\\30391\\Desktop\\work3.txt");
        }
    }

    private static void workOne() {

        File file1 = new File("C:\\Users\\30391\\Desktop\\文本.txt");
        File file2 = new File("C:\\Users\\30391\\Desktop");

        System.out.println("file1.getAbsolutePath() = " + file1.getAbsolutePath());
        System.out.println("file2.getAbsolutePath() = " + file2.getAbsolutePath());

        System.out.println("file1.getName() = " + file1.getName());
        System.out.println("file2.getName() = " + file2.getName());

        System.out.println("file1.getParent() = " + file1.getParent());
        System.out.println("file2.getParent() = " + file2.getParent());

        System.out.println("file1.exists() = " + file1.exists());
        System.out.println("file2.exists() = " + file2.exists());

        System.out.println("file1.isFile() = " + file1.isFile());
        System.out.println("file2.isFile() = " + file2.isFile());

        System.out.println("file1.isDirectory() = " + file1.isDirectory());
        System.out.println("file2.isDirectory() = " + file2.isDirectory());

    }


}
