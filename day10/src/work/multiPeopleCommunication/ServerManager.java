package work.multiPeopleCommunication;

import java.io.*;
import java.net.Socket;

/**
 * @author 30391
 */
public class ServerManager extends Thread {
    Socket socket;

    public ServerManager(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(socket.getInputStream());
        } catch (IOException e) {
            throw new RuntimeException("Error initializing DataInputStream", e);
        }

        while (true) {
            try {
                String string = dataInputStream.readUTF();
                writeToFile(string);
                System.out.println(string);
            } catch (IOException e) {
                System.out.println("IP及地址为" + socket.getRemoteSocketAddress() + "的用户下线了");
                break;
            }
        }

        try {
            if (dataInputStream != null) {
                dataInputStream.close();
            }
        } catch (IOException ex) {
            throw new RuntimeException("Error closing DataInputStream", ex);
        }

        try {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        } catch (IOException ex) {
            throw new RuntimeException("Error closing socket", ex);
        }
    }

    private static synchronized void writeToFile(String message) {
        try (FileWriter fileWriter = new FileWriter("day10/src/work/multiPeopleCommunication/session.txt", true);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            writer.write(message);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException("Error writing to file", e);
        }
    }


}




