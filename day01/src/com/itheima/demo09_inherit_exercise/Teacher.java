package com.itheima.demo09_inherit_exercise;

/**
 * 老师
 */
public class Teacher extends People {
    private String skill;//技能

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void printInfo() {
        System.out.println(getName() + "具备的技能：" + skill);
    }
}
