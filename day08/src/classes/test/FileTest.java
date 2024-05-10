package classes.test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author 30391
 */
public class FileTest {
    public static void main(String[] args) throws IOException {

        File file = new File("C:/User/30391/Desktop/Feasfeas");
        File file1 = new File("C:\\Users\\30391\\Desktop\\patrick star", "avator.png");
        File file2 = new File("C:\\Users\\30391\\Desktop\\patrick star", "aaa.txt");
        File file3 = new File("C:\\Users\\30391\\Desktop\\patrick star", "drier");
        File file4 = new File("C:\\Users\\30391\\Desktop\\patrick star\\newDirector");
        File file5 = new File("C:\\Users\\30391\\Desktop\\patrick star\\newDirector/feasfeas/fasdfsad");
        File file6 = new File("C:\\Users\\30391\\Desktop\\patrick star");


        System.out.println("file = " + file);
        System.out.println("file1 = " + file1);

        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.isDirectory() = " + file.isDirectory());
        System.out.println("file1.isDirectory() = " + file1.isDirectory());
        System.out.println("file1.isFile() = " + file1.isFile());


        System.out.println("file.getPath() = " + file.getPath());
        System.out.println("file.getParent() = " + file.getParent());
        System.out.println("file.getParentFile() = " + file.getParentFile());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());
        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.length() = " + file.length());
        System.out.println("file.lastModified() = " + file.lastModified());

        System.out.println("file2.createNewFile() = " + file2.createNewFile());
        System.out.println("file3.createNewFile() = " + file3.createNewFile());
        System.out.println("file4.mkdir() = " + file4.mkdir());
//        System.out.println("file5.mkdirs() = " + file5.mkdirs());
        System.out.println("file5.getParent() = " + file5.getParent());
        System.out.println("file6.listFiles() = " + Arrays.toString(file6.list()));
        System.out.println("file6.listFiles() = " + Arrays.toString(file6.listFiles()));

        File[] files = file6.listFiles();
        System.out.println("file6.list()删除前 = " + Arrays.toString(file6.list()));
        for (File fils : files) {
            if (fils.isDirectory()) {
                System.out.println("进入");
                boolean delete = fils.delete();
                System.out.println(delete);
            }

        }
        System.out.println("file6.list()删除后 = " + Arrays.toString(file6.list()));


    }
}
