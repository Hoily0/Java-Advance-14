package work.may10th.work.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 30391
 */
public class NumberOfProgramRuns {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("day08/director/numberCount.txt");
        FileOutputStream outputStream = new FileOutputStream("day08/director/numberCount.txt");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String next = scanner.next();
            System.out.println("输入back退出");
            if ("ct".equals(next)) {

                if (inputStream.read() < 4) {
                    int newRead = inputStream.read();

                    System.out.println("欢迎使用本软件，第" + (newRead + 1) + "使用免费");
                    outputStream.write(newRead + 1);
                    outputStream.flush();

                } else {
                    System.out.println("次数不足");
                }

            } else if ("back".equals(next)) {
                break;
            }


        }
        inputStream.close();
        outputStream.close();
    }
}
