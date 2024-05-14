package work.may10th.work.entity;

import work.may10th.test.printTest.PrintStreamTest;

/**
 * @author 30391
 */
public class Student {
    private String name;
    private String gender;
    private Integer age;
    private Double score;


    public Student() {
    }

    public Student(String name, String gender, Integer age, Double score) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.score = score;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return score
     */
    public Double getScore() {
        return score;
    }

    /**
     * 设置
     * @param score
     */
    public void setScore(Double score) {
        this.score = score;
    }

    public String toString() {
        return "Student{name = " + name + ", gender = " + gender + ", age = " + age + ", score = " + score + "}";
    }
}
