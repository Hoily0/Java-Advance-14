package work.multiPeopleCommunication;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 30391
 */
public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(43000);

        while (true) {

            Socket accept = serverSocket.accept();
            System.out.println("ip地址为：" + accept.getRemoteSocketAddress() + "的用户已上线");

            ServerManager serverManager = new ServerManager(accept);
            serverManager.start();



        }


    }
}
