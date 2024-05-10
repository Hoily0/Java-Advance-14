package work.may10th.test.bufferedtest;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author 30391
 */
public class Transcoding {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("day08/File/test.txt");

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        int b;
        while ((b = inputStreamReader.read()) != -1) {
            System.out.print((char) b);
        }
        inputStreamReader.close();
        inputStream.close();




        /*
        输出转换流
         */

        FileOutputStream fileOutputStream = new FileOutputStream("day08/File/test.txt", true);
        OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream, "GBK");
        writer.write(String.valueOf(true));
        writer.close();
        fileOutputStream.close();


    }
}
