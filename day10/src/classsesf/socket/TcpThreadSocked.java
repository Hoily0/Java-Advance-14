package classsesf.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @author 30391
 */
public class TcpThreadSocked extends Thread {
    private Socket socket;

    public TcpThreadSocked(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream inputStream = null;
        try {
            inputStream = socket.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        while (true) {
            try {
                String message = dataInputStream.readUTF();
                System.out.println(message);
            } catch (IOException e) {
                System.out.println(socket.getRemoteSocketAddress() + "下线了");

                try {
                    dataInputStream.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    socket.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                break;

            }
        }

    }
}
