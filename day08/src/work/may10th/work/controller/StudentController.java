package work.may10th.work.controller;

import work.may10th.work.entity.Student;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 30391
 */
public class StudentController {
    public static void main(String[] args) throws IOException {

        /*
        题目3
         */
        createObjects(Path.of("day08/director/test2.txt"));

        /*
        题目4
         */

        readerObjects(Path.of("day08/director/test2.txt"));


    }

    private static void readerObjects(Path path) throws IOException {

        FileReader fileReader = new FileReader(String.valueOf(path));
        BufferedReader reader = new BufferedReader(fileReader);
        List<Student> students = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] split = line.split(",");
            String name = split[0];
            String gender = split[1];
            int age = Integer.parseInt(split[2]);
            Double score = Double.parseDouble(split[3]);
            Student student = new Student(name, gender, age, score);
            students.add(student);

        }
        reader.close();
        fileReader.close();
        System.out.println("students = " + students);


    }

    private static void createObjects(Path path) throws IOException {
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("迪丽热巴", "女", 18, 99D));
        stuList.add(new Student("古力娜扎", "女", 19, 98D));
        stuList.add(new Student("周杰伦", "男", 20, 88D));
        stuList.add(new Student("蔡徐坤", "男", 19, 78D));

        FileWriter fileWriter = new FileWriter(String.valueOf(path));
        BufferedWriter writer = new BufferedWriter(fileWriter);

        for (Student student : stuList) {
            writer.write(student.getName() + "," + student.getGender() + "," +
                    student.getAge() + "," + student.getScore());
            writer.newLine();


        }
        writer.close();
        fileWriter.close();
    }


}


