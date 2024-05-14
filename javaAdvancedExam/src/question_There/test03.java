package question_There;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.function.Consumer;

/**
 * @author 30391
 */
public class test03 {
    public static void main(String[] args) throws IOException, ParseException {
        ArrayList<Student> students = new ArrayList<>();
        extracted(students);
        traverse(students);


    }

    private static void traverse(ArrayList<Student> students) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        students.forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                if (stringIntegerHashMap.containsKey(student.getLocal())) {
                    stringIntegerHashMap.put(student.getLocal(), stringIntegerHashMap.get(student.getLocal()) + 1);
                } else {
                    stringIntegerHashMap.put(student.getLocal(), 1);
                }
            }
        });
        stringIntegerHashMap.forEach((k, v) -> System.out.println(k + " " + v));

    }

    private static void extracted(ArrayList<Student> students) throws IOException, ParseException {
        FileReader reader = new FileReader("javaAdvancedExam/src/student-data.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                Date parse = simpleDateFormat.parse(split[3]);
                students.add(new Student(Integer.parseInt(split[0]), split[1], split[2], parse, split[4]));
            }

        } finally {
            bufferedReader.close();
        }
    }
}

