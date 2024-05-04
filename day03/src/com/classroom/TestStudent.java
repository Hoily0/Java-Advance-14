package com.classroom;

public class TestStudent {


    public static void main(String[] args) {
        Student student = new Student("dwAdWA", 18);
        Student student1 = new Student("零撒法恩斯", 73);
        Student student2 = new Student("零撒法恩斯", 73);


        System.out.println(student == student2);
        System.out.println(student1 == student2);

        System.out.println(student.equals(student2));
        System.out.println(student1.equals(student2));


    }
}
