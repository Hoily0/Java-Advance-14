package work.mayNine;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

/**
 * @author 30391
 */
public class IOReadWriteTest {
    public static void main(String[] args) throws IOException {
        /*
         *  题目一
         */
//        copyFileOfOneByte(Path.of("C:\\Users\\30391\\IdeaProjects\\projectAdvance\\
//        day08\\File\\File1.txt"),
//                Path.of("C:\\Users\\30391\\IdeaProjects\\projectAdvance\\
//                day08\\File\\File2.txt"));


        /*
         *  题目二
         */


        IOReadWriteTest ioReadWrite = new IOReadWriteTest();
        ioReadWrite.copyFileOfOneTimes(Path.of("C:\\Users\\30391\\IdeaProjects\\projectAdvance\\" +
                        "day08\\File\\File1.txt"),
                Path.of("C:\\Users\\30391\\IdeaProjects\\projectAdvance\\" +
                        "day08\\File\\File2.txt"));

    }

    private void copyFileOfOneTimes(Path inputPath, Path outputPath) throws IOException {

        FileInputStream inputStream = new FileInputStream(String.valueOf(inputPath));
        FileOutputStream outputStream = new FileOutputStream(String.valueOf(outputPath), true);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            System.out.println("写入前");
            outputStream.write(bytes, 0, len);
            System.out.println("写入后");
        }

    }


    private static void copyFileOfOneByte(Path inputPath, Path outputPath) throws IOException {
        FileInputStream inputStream = new FileInputStream(String.valueOf(inputPath));
        FileOutputStream outputStream = new FileOutputStream(String.valueOf(outputPath));
        int oneByte;
        while ((oneByte = inputStream.read()) != -1) {
            outputStream.write(oneByte);
        }

    }


}
