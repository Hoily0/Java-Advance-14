package classsesf.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 30391
 */
public class TcpServerTest {
    public static void main(String[] args) throws IOException {

        ServerSocket socket = new ServerSocket(47000);

        Socket accept = socket.accept();

        InputStream inputStream = accept.getInputStream();

        DataInputStream dataInputStream = new DataInputStream(inputStream);

        System.out.println("dataInputStream.readUTF() = " + dataInputStream.readUTF());
        System.out.println("socket.getInetAddress().getHostAddress() = " + socket.getInetAddress().getHostAddress());
    }
}
