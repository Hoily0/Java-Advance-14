package online.test;

import online.entity.Student;

import java.util.*;


/**
 * @author 30391
 */
public class StudentTest {
    public static void main(String[] args) {

//        TreeSet<Student> students = new TreeSet<>();
//
//        Student student1 = new Student("零发呢阿布", 19);
//        Student student2 = new Student("保帕耳机", 13);
//        Student student3 = new Student("皮肤好是南非", 17);
//        Student student4 = new Student("fioasj", 231);
//        Student student5 = new Student("洁癖哦", 60);
//        Student student6 = new Student("零发呢阿布", 19);
//
//        Student[] nums = {student1, student2, student3, student4, student5, student6};
//        Collections.addAll(students, nums);
//        System.out.println("students = " + students);
//
//
//
//
//        TreeSet<Student> students1 = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o2.getAge() - o1.getAge();
//            }
//
//        });
//        Collections.addAll(students1, nums);
//        System.out.println(students1);
//
//
//        TreeSet<Student> students2 = new TreeSet<>( (o1, o2) -> {return  o1.getAge() - o2.getAge();});
//        Collections.addAll(students2, nums);
//        System.out.println(students2);
        //籍贯：Birthplace
        Map<Student, String> map = new HashMap<>();

        Student student1 = new Student("零扫粉色", 45);
        Student student2 = new Student("发送字符", 5);
        Student student3 = new Student("怕你发发", 18);
        Student student4 = new Student("今年魔法师", 30);
        Student student5 = new Student("今年魔法师", 30);

//        Student[] students = {student1, student2, student3,student4};
//        String[] Birthplace = {"南京", "上海", "深圳", "北京"};

        map.put(student1, "南京");
        map.put(student2, "上海");
        map.put(student3, "深圳");
        map.put(student4, "北京");
        map.put(student5, "广州");

        map.forEach((k, v) -> System.out.println(k + v));

        LinkedHashMap<Student, String> stringStringLinkedHashMap = new LinkedHashMap<>(map);

        System.out.println("stringStringLinkedHashMap = " + stringStringLinkedHashMap);

        TreeMap<Student, String> treeMap = new TreeMap<>(map);
        treeMap.forEach((student, s) -> System.out.println(s));

    }
}
