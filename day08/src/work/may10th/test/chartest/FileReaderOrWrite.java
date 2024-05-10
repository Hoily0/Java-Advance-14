package work.may10th.test.chartest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author 30391
 */
public class FileReaderOrWrite {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("day08/File/test.txt");

//        int c;
//        while ((c = fileReader.read()) != -1){
//            System.out.print((char) c);
//        }
//        fileReader.close();

//        char[] chars = new char[3];
//        int len;
//        while ((len = fileReader.read()) != -1){
//            System.out.print((char) len);
//        }
//        fileReader.close();

        FileWriter fileWriter = new FileWriter("day08/File/test.txt", true);

        fileWriter.write("字符输出流写入数据" + "\r\n");
//        fileWriter.write("\r\n");
        fileWriter.close();

    }
}
