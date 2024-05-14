package work.multiPeopleCommunication;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @author 30391
 */
public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 43000);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        Scanner scanner = new Scanner(System.in);
        System.out.println("你的源ip端口以及目标端口为：" + socket);
        while (true) {

            System.out.println("请输入发送消息  （Tips：输入 exit 退出本次会话）");
            String next = scanner.nextLine();
            if ("exit".equals(next)) {
                dataOutputStream.close();
                socket.close();
                break;
            } else {
                try {
                    dataOutputStream.writeUTF(next);
                } catch (SocketException socketException) {
                    System.out.println("服务端已关闭");
                    dataOutputStream.close();
                    socket.close();
                }

            }
        }


    }
}
