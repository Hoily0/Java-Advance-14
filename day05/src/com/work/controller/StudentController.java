package com.work.controller;

import com.work.entity.Student;
import com.work.globalException.AgeException;
import com.work.globalException.ScoreException;

/**
 * @author 30391
 */
public class StudentController {
    public static void main(String[] args) {

        Student student = new Student();

        try {
            student.setChineseScore(1009);
        } catch (ScoreException e) {
            student.setChineseScore(10);
            System.out.println("重置语文成绩为默认值");
            e.printStackTrace();
        }

        try {
            student.setEnglishScore(99);
        } catch (ScoreException e) {
            student.setEnglishScore(10);
            System.out.println("重置英语成绩为默认值");
            e.printStackTrace();
        }

        try {
            student.setMathScore(-100);
        } catch (ScoreException e) {
            student.setMathScore(10);
            System.out.println("重置数学成绩为默认值");
            e.printStackTrace();
        }

        System.out.println(student);
        try {
            student.setAge(12342345);
        } catch (AgeException e) {
            student.setAge(20);
            System.out.println("年龄不合法，已重置为20");
            e.printStackTrace();
        }
        System.out.println(student);


    }
}
