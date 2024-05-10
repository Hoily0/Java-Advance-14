package work.may10th.test.bufferedtest;

import java.io.*;
import java.util.Scanner;

/**
 * @author 30391
 */
public class SecondRateExchangeTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String suffix = scanner.next();

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\" +
                "30391\\Desktop\\patrick star\\PATRICK-STAR STUPID.gif"));
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\30391\\Desktop\\" +
                "每日笔记\\新建11." + suffix);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        byte[] bytes = new byte[1024];
        int b;
        while ((b = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(b);
        }
        bufferedOutputStream.close();

    }
}
