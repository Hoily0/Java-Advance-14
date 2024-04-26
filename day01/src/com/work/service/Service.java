package com.work.service;

import com.work.entity.Car;
import com.work.entity.Student;

public class Service {
    public void work1() {

        Student stu1 = new Student();
        Student.setSchool("五道口职业学院");
        stu1.setName("夏竹");
        stu1.setAge(18);

        Student stu2 = new Student();
        stu2.setName("王多鱼");
        stu2.setAge(19);

        System.out.println(stu1.getName() + " " + stu1.getAge());
        System.out.println(stu2.getName() + " " + stu2.getAge());
        System.out.println(Student.getSchool());

    }

    public static void work2() {

        new Car();
        new Car();
        new Car();
        new Car();
        new Car();
        new Car();

        System.out.println(Car.number);
    }


}
