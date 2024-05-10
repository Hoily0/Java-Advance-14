package work.may10th.work.controller;

import work.may10th.work.entity.User;

import javax.management.openmbean.OpenMBeanInfo;
import java.io.*;

/**
 * @author 30391
 */
public class UserController {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user = new User("迪丽热巴", "女", 18);

        FileOutputStream fileOutputStream = new FileOutputStream("day08/director/test3.txt", true);
        ObjectOutputStream stream = new ObjectOutputStream(fileOutputStream);

        stream.writeObject(user);
        stream.close();

        FileInputStream fileInputStream = new FileInputStream("day08/director/test3.txt");
        ObjectInputStream stream1 = new ObjectInputStream(fileInputStream);

        System.out.println("stream1.readObject() = " + stream1.readObject());
        stream1.close();

    }
}
