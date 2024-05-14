package classsesf.socket;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 30391
 */
public class TcpThreadClient {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("192.168.39.55", 43000);

        ArrayList objects = new ArrayList();
        OutputStream outputStream = socket.getOutputStream();

        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String next = scanner.next();
            if ("exit".equals(next)) {
                dataOutputStream.close();
            }
            dataOutputStream.writeUTF(next);

        }


    }
}
