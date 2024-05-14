package classsesf.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 30391
 */
public class TcpThreadServer {
    public static void main(String[] args) throws IOException {

        System.out.println("服务端启动");

        ServerSocket serverSocket = new ServerSocket(43000);

        while (true) {
            Socket accept = serverSocket.accept();
            System.out.println(accept.getRemoteSocketAddress() + "上线了");

            new TcpThreadSocked(accept).start();
        }
    }


}
