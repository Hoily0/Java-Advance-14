package classsesf.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author 30391
 */
public class UdpClientTest {
    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket(47000);

        byte[] bytes = "这是可能是本机发出的请求".getBytes();


        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.39.47"), 5555);

        socket.send(packet);

        socket.close();

    }
}
