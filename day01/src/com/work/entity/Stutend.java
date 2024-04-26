package com.work.entity;

public class Stutend extends People {
    private String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Stutend(String name, int age) {
        super(name, age);
    }

    public Stutend(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }


    public String toString() {
        return getName() + "今年"
                + getAge() + "岁，他的年级是"
                + getGrade();
    }
}
