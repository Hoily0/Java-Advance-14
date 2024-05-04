package com.work.controller;

import com.work.entity.Student;

import java.util.Collections;
import java.util.HashSet;

/**
 * @author 30391
 */
public class StudentController {
    public static void main(String[] args) {

        Student student1 = new Student(1, "张三", "上海");
        Student student2 = new Student(2, "李四", "上海");
        Student student3 = new Student(1, "张三", "南京");
        Student student4 = new Student(2, "王五", "上海");
        Student student5 = new Student(1, "张三", "深圳");

        Student[] result = new Student[]{student1, student2, student3, student4, student5};

        HashSet<Student> set = new HashSet<>();
        Collections.addAll(set, result);
        System.out.println(set);
    }
}
