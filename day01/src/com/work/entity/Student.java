package com.work.entity;

public class Student {
    private static String school;
    private String name;
    private int age;
    double score;


    public Student() {
    }

    public Student(String school, String name, int age) {
        this.school = school;
        this.name = name;
        this.age = age;
    }

    public Student(double score) {
        this.score = score;
    }

    public static void printHelloWorld() {
        System.out.println("HelloWorld!");
        System.out.println("HelloWorld!");
        System.out.println("HelloWorld!");
    }

    public void printPass() {
        if (score >= 60) {
            System.out.println("成绩合格");
        } else {
            System.out.println("成绩不合格");
        }
    }


    /**
     * 获取
     *
     * @return school
     */
    public static String getSchool() {
        return school;
    }

    /**
     * 设置
     *
     * @param school
     */
    public static void setSchool(String school) {
        Student.school = school;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{school = " + school + ", name = " + name + ", age = " + age + "}";
    }
}
