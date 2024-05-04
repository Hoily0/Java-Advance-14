package com.work.test;

import com.work.entity.Coder;
import com.work.entity.Manager;
import com.work.entity.Student;

public class testMnage {

    final static String NAME = "林臻东";

    public static void main(String[] args) {
        Coder coder = new Coder("张三", 23, 15000);
        coder.work();

        Manager m = new Manager("李四", 24, 18000, 5000);
        m.work();

        System.out.println("NAME = " + NAME);

        final Student student = new Student("广济", "林分别", 23);
        student.setName("fe");

        //student = new Student("fes","fes",12);

        System.out.println(student);

    }
}
