package com.itheima.object;

// ptg
public class Student {

    private String name;
    private int age;

    @Override
    public boolean equals(Object obj) {   // Object obj = stu2;
        // this : stu1对象
        // obj : stu2对象
        if (obj instanceof Student) {
            // 向下转型 : 为了调用子类特有的成员
            // stu : stu2对象
            Student stu = (Student) obj;
            return this.age == stu.age && this.name.equals(stu.name);
        } else {
            // 类型不是Student, 返回false
            return false;
        }
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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


}