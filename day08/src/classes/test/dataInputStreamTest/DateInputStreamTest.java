package classes.test.dataInputStreamTest;

import java.io.*;

/**
 * @author 30391
 */
public class DateInputStreamTest implements Serializable {
    public static void main(String[] args) throws IOException {

        FileOutputStream outputStream = new FileOutputStream("test.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        FileInputStream inputStream = new FileInputStream("test.txt");
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        dataOutputStream.writeInt(100);
        System.out.println("dataInputStream.readInt() = " + dataInputStream.readInt());

        dataOutputStream.writeDouble(789.8);
        System.out.println("dataInputStream.readDouble() = " + dataInputStream.readDouble());

        dataOutputStream.writeBoolean(true);
        System.out.println("dataInputStream.readBoolean() = " + dataInputStream.readBoolean());


        dataOutputStream.close();
        dataInputStream.close();

    }
}
