package com.work.entity;

public class Studend extends Person {
    private String school;
    private int stuNumber;

    public Studend() {
    }

    public Studend(String school, int stuNumber) {
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public Studend(String name, String gender, int age, String nationality, String school, int stuNumber) {
        super(name, gender, age, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }

    /**
     * 获取
     *
     * @return school
     */
    public String getSchool() {
        return school;
    }

    /**
     * 设置
     *
     * @param school
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * 获取
     *
     * @return stuNumber
     */
    public int getStuNumber() {
        return stuNumber;
    }

    /**
     * 设置
     *
     * @param stuNumber
     */
    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String toString() {
        return "Studend{school = " + school + ", stuNumber = " + stuNumber + "}";
    }
}
