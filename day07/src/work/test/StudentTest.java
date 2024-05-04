package work.test;

import work.entity.Student;

import java.util.TreeMap;

/**
 * @author 30391
 */
public class StudentTest {
    public static void main(String[] args) {

        TreeMap<Student, String> map = new TreeMap<>();

        map.put(new Student("黑马", 16), "北京");
        map.put(new Student("传智", 16), "西安");

        map.forEach((student, address) -> System.out.println(student + " " + address));
    }
}
