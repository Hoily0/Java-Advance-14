package work.entity;

import java.io.Serializable;

/**
 * @author 30391
 */
public class Student implements Serializable {
    private String name;
    private String sex;
    private Integer age;
    private Double score;


    public Student() {
    }

    public Student(String name, String sex, Integer age, Double score) {
        this.name = name;
        this.sex = sex;
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
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     *
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     *
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return score
     */
    public Double getScore() {
        return score;
    }

    /**
     * 设置
     *
     * @param score
     */
    public void setScore(Double score) {
        this.score = score;
    }

    public String toString() {
        return "Student{name = " + name + ", sex = " + sex + ", age = " + age + ", score = " + score + "}";
    }
}
