package com.work.hashStudentControole;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author 30391
 */
public class HashStudentController {

    public static void main(String[] args) {

        LinkedHashSet<HashStudentEntity> hashSet = new LinkedHashSet<>();


        HashStudentEntity student = new HashStudentEntity("林费萨尔", 18, "男");
        HashStudentEntity student2 = new HashStudentEntity("王女配角", 45, "女");
        HashStudentEntity student3 = new HashStudentEntity("假分数", 15, "女");
        HashStudentEntity student4 = new HashStudentEntity("哈巴va1", 8, "男");
        HashStudentEntity student5 = new HashStudentEntity("林费萨尔", 18, "男");

        hashSet.add(student);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);
        hashSet.add(student5);

        System.out.println("hashSet = " + hashSet);

        hashSet.forEach(System.out::println);

        for (HashStudentEntity i : hashSet) {
            System.out.println(i);
        }

        Iterator<HashStudentEntity> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
