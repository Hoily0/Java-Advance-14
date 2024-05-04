package com.work.entity;

public class Coder extends Employee {
    @Override
    public void work() {
        System.out.println("姓名为" + super.getName() +
                "，年龄为" + super.getAge() + "，工资为" + super.getSalary() +
                "的程序员正在编写代码");
    }


    public Coder(String name, int age, double salary) {
        super(name, age, salary);
    }
}
