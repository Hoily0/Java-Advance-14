package com.itheima._hashset;

import java.util.Objects;

public class Student {
    private String name;
    private String address;

    /*
        由属性值生成hashcode，属性值相同，hashcode也想通
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    /*
        由比较地址，变成比较属性内容
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(address, student.address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
