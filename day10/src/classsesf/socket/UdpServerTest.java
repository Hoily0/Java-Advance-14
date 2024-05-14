package classsesf.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author 30391
 */
public class UdpServerTest {
    public static void main(String[] args) throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket(65520);
        byte[] bytes = new byte[1024 * 64];

        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

        datagramSocket.receive(datagramPacket);

        String string = new String(bytes, 0, datagramPacket.getLength());

        System.out.println(string);

        datagramSocket.close();
    }
}
