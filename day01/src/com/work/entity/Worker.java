package com.work.entity;

public class Worker extends Person {
    private String unit;
    private int workAge;

    public Worker() {
    }

    public Worker(String unit, int workAge) {
        this.unit = unit;
        this.workAge = workAge;
    }

    @Override
    public void work() {
        System.out.println("工人的工作是盖房子");
    }

    public Worker(String name, String gender, String nationality, int age, String unit, int workAge) {
        super(name, gender, age, nationality);
        this.unit = unit;
        this.workAge = workAge;

    }

    /**
     * 获取
     *
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置
     *
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取
     *
     * @return workAge
     */
    public int getWorkAge() {
        return workAge;
    }

    /**
     * 设置
     *
     * @param workAge
     */
    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public String toString() {
        return "Worker{unit = " + unit + ", workAge = " + workAge + "}";
    }
}
