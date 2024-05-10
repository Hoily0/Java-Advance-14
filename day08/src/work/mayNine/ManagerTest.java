package work.mayNine;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 30391
 */
public class ManagerTest {
    public static void main(String[] args) throws IOException {


        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\30391\\" +
                "IdeaProjects\\projectAdvance\\day08\\File\\Manager");
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String string = scanner.nextLine();
            if ("end".equals(string)) {
                break;
            } else {
                outputStream.write(("heima" + string + "\r\n").getBytes());
            }
            outputStream.close();

        }
    }
}
