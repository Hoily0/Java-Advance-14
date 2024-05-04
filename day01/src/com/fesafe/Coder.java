package com.fesafe;

public class Coder extends Employee {
    @Override
    public void work() {
        System.out.println(super.name + "程序员,工资" + super.salary + "，工作是敲代码。");
    }
}
