package com.itheima.demo16_this_constructor;

/**
 * 任意类的构造器中，是可以通过this(…) 去调用该类的其他构造器的。
 * this(...)和super(…)使用时的注意事项：
 * this(…) 、super(…) 都只能放在构造器的第一行，因此，有了this(…)就不能写super(…)了，反之亦然。
 */
public class Student extends People {
    private String name;
    private int age;
    private String schoolName;

    public Student(String name, int age) {
        this(name, age, "黑马程序员");//访问构造方法
        this.name = name; //访问成员变量
        this.getSchoolName();//访问成员方法
    }

    public Student(String name, int age, String schoolName) {
        super("10");
        super.size = "10";//访问父类成员变量
        super.getSize();//访问父类成员方法
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
