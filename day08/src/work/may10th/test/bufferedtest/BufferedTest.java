package work.may10th.test.bufferedtest;

import java.io.*;

/**
 * @author 30391
 */
public class BufferedTest {
    public static void main(String[] args) throws IOException {

        /*
        缓冲字节输入输出
         */

        FileInputStream fileInputStream = new FileInputStream("day08/File/test.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        byte[] bytes = new byte[3];
        int b;
        while ((b = bufferedInputStream.read(bytes)) != -1) {
            System.out.println((char) b);
        }
        bufferedInputStream.close();
        fileInputStream.close();

//
//        FileOutputStream fileOutputStream = new FileOutputStream("day08/File/test.txt",true);
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//        bufferedOutputStream.write("这是字节缓冲流输出流".getBytes());
//        bufferedOutputStream.close();
//        fileOutputStream.close();


        /*
        缓冲字符输入输出
         */

//        FileReader fileReader = new FileReader("day08/File/test.txt");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//        int len;
//        while ((len = bufferedReader.read()) != -1){
//            System.out.print((char) len);
//        }
//        bufferedReader.close();
//        fileOutputStream.close();
//
//
//        FileWriter fileWriter = new FileWriter("day08/File/test.txt", true);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.newLine();
//        bufferedWriter.write("这是缓冲字符输出流");
//
//        bufferedWriter.close();
//        fileWriter.close();
    }
}
