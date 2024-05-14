package classsesf.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 30391
 */
public class TcpClientTest {
    public static void main(String[] args) throws IOException {

//        String proxyIp = "192.168.39.43";
//        int proxyPort = 47000;
//        Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(proxyIp, proxyPort));
//
//        Socket socket = new Socket(proxy);
//        socket.connect(new InetSocketAddress("192.168.39.55", 47000));

        Socket socket = new Socket("192.168.39.55", 47000);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("输入要发送的内容");
            String next = scanner.next();
            if (!"exit".equals(next)) {
                dataOutputStream.writeUTF(next);
            }
            dataOutputStream.close();
            socket.close();
        }


    }
}
