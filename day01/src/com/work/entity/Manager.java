package com.work.entity;

public class Manager extends Employee {
    private double bonus;

    @Override
    public void work() {
        System.out.println("姓名为" + super.getName() +
                "，年龄为" + super.getAge() + "，工资为" + super.getSalary() +
                "，奖金为" + this.getBonus() +
                "的项目经理正在分配任务");
    }

    public Manager(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;

    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
