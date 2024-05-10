package work.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author 30391
 */
public class EncodeDecode {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String str = "c飞啊u搜房报随98734分爱上";


        byte[] bytes = str.getBytes("UTF-8");
        byte[] bytes1 = str.getBytes(StandardCharsets.UTF_8);

        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(bytes1));


        String s = new String(bytes);
        System.out.println("s = " + s);
        String s1 = new String(bytes1, "UTF-8");
        System.out.println("s1 = " + s1);
        String s3 = new String(bytes, StandardCharsets.UTF_16BE);
        String s4 = new String(bytes, StandardCharsets.UTF_16LE);
        String s5 = new String(bytes, StandardCharsets.UTF_16);
        System.out.println("s3 = " + s3);


    }
}
