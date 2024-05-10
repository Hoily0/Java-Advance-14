package work.may10th.test.serializable;

import work.entity.Student;

import java.io.*;

/**
 * @author 30391
 */
public class SerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fileOutputStream = new FileOutputStream("day08/File/test.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);


        Student student = new Student("林峰撒", "男", 39, 78.5);
        Student student2 = new Student("王法二", "女", 19, 99D);
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
        fileOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("day08/File/test.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student o = (Student) objectInputStream.readObject();
        System.out.println(o);


    }

}
