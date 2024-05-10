package work.may10th.test.printTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author 30391
 */
public class PrintStreamTest {
    public static void main(String[] args) throws IOException {

        PrintStream p = new PrintStream(new FileOutputStream("day08/File/test.txt"), true);
        System.setOut(p);


        System.out.println("里好啊");
        System.out.println("嗨嗨你啊");
        p.close();
    }
}
