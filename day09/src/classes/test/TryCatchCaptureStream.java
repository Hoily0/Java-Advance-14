package classes.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 30391
 */
public class TryCatchCaptureStream {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        老写法
         */

//        FileInputStream inputStream = new FileInputStream("day09/test/test1");
//        FileOutputStream outputStream = new FileOutputStream("day09/test/test1");
//        try{
//
//
//            outputStream.write(10/ 0);
//
//        }catch (IOException ioException){
//            ioException.printStackTrace();
//            if (!outputStream.equals(null)){
//                try{

//                    outputStream.close();
//                }catch (IOException e){
//                    e.printStackTrace();
//                }
//            }

        /**
         * 新写法，将创建流的语句放入try()中，出现问题的其余代码用try包裹catch自动释放流
         */


        try (FileInputStream inputStream = new FileInputStream("day09/test/test1");
             FileOutputStream outputStream = new FileOutputStream("day09/test/test1");
        ) {
            int b = 0;
        } catch (IOException e) {

        }


    }
}
