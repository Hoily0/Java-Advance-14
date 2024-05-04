package com.fesafe;

public class Manager extends Employee {
    private String c0mm;


    @Override
    public void work() {
        System.out.println(super.name + "经理，工资" + super.salary + "，奖金" + this.getC0mm() + "，工作是管理项目");
    }

    public void setC0mm(String c0mm) {
        this.c0mm = c0mm;
    }

    public String getC0mm() {
        return c0mm;
    }
}
