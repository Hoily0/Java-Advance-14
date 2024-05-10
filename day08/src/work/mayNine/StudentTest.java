package work.mayNine;

import work.entity.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 30391
 */
public class StudentTest {
    public static void main(String[] args) throws IOException {

        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("张三", "男", 20, 88D));
        stuList.add(new Student("李四", "女", 19, 99D));

        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\30391\\IdeaProjects\\" +
                "projectAdvance\\day08\\File\\student.txt", false);

        for (Student student : stuList) {
            outputStream.write((student.getName().getBytes()));
            outputStream.write(",".getBytes());
            outputStream.write(student.getSex().getBytes());
            outputStream.write(",".getBytes());
            outputStream.write(student.getAge().toString().getBytes());
            outputStream.write(",".getBytes());
            outputStream.write(student.getScore().toString().getBytes());
            outputStream.write("\r\n".getBytes());
        }
    }
}
