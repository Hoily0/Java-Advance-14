package classes.test;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 30391
 */
public class IoReadAndWrite {
    public static void main(String[] args) throws IOException {

        FileInputStream stream = new FileInputStream("C:\\Users\\30391\\Desktop\\" +
                "patrick star\\aaa.txt");
//        System.out.println("stream.read() = " + stream.read());
//        System.out.println("(char)stream.read() = " + (char) stream.read());
//
//        int read = stream.read();
//        System.out.println(read);
//        System.out.println((char) read);
//
//        int b;
//        while ((b = stream.read()) != -1){
//            System.out.println(b);
//            System.out.println((char)b);
//        }
//        int len;
//        while ((len = stream.read()) != -1){
//            System.out.print((char) len);
//        }
//        while (stream.read() != -1){
//            System.out.print(stream.read());
//        }

//        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\30391\\Desktop\\" +
//                "patrick star\\aaa.txt",true);
//
//        fileOutputStream.write("\n".getBytes());


        FileInputStream inputStream = new FileInputStream("C:\\Users\\30391\\Desktop\\vps\\Vps属性.txt");
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\30391\\Desktop\\patrick star\\avator.png");

//        int len;
//        while((len =inputStream.read()) != -1){
//            System.out.println(len);
//            outputStream.write(len);
//        }
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            System.out.println(len);
            outputStream.write(bytes, 0, len);
        }


    }
}
