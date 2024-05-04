package com.work.entity;

/**
 * @author 30391
 */
public class Manager {

    private String name;
    private int age;
    private double score;

    public Manager() {
    }

    public Manager(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    /**
     * 获取
     *
     * @return score
     */
    public double getScore() {
        return score;
    }

    /**
     * 设置
     *
     * @param score
     */
    public void setScore(double score) {
        this.score = score;
    }

    public String toString() {
        return "Manager{name = " + name + ", age = " + age + ", score = " + score + "}";
    }
}
