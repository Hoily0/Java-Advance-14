package com.work.entity;

import com.work.globalException.AgeException;
import com.work.globalException.ScoreException;

/**
 * @author 30391
 */
public class Student {
    private String name;
    private int age;
    private double mathScore;
    private double chineseScore;
    private double englishScore;

    public Student() {
    }

    public Student(String name, int age, double mathScore, double chineseScore, double englishScore) {

        this.name = name;
        this.age = age;
        this.mathScore = mathScore;
        this.chineseScore = chineseScore;
        this.englishScore = englishScore;
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
    public void setAge(int age) throws AgeException {
        if (age < 0 || age > 120) {
            throw new AgeException("年龄信息不合法");
        } else {
            this.age = age;
        }

    }

    /**
     * 获取
     *
     * @return mathScore
     */
    public double getMathScore() {
        return mathScore;
    }

    /**
     * 设置
     *
     * @param mathScore
     */
    public void setMathScore(double mathScore) throws ScoreException {
        if (mathScore > 100 || mathScore < 0) {
            throw new ScoreException("数学成绩不合法");
        } else {
            this.mathScore = mathScore;
        }

    }

    /**
     * 获取
     *
     * @return chineseScore
     */
    public double getChineseScore() {
        return chineseScore;
    }

    /**
     * 设置
     *
     * @param chineseScore
     */
    public void setChineseScore(double chineseScore) throws ScoreException {
        if (chineseScore > 100 || chineseScore < 0) {
            throw new ScoreException("语文成绩不合格");
        } else {
            this.chineseScore = chineseScore;
        }

    }

    /**
     * 获取
     *
     * @return englishScore
     */
    public double getEnglishScore() {
        return englishScore;
    }

    /**
     * 设置
     *
     * @param englishScore
     */
    public void setEnglishScore(double englishScore) throws ScoreException {
        if (englishScore > 100 || englishScore < 0) {
            throw new ScoreException("英语成绩不合格");
        } else {
            this.englishScore = englishScore;
        }

    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", mathScore = " + mathScore + ", chineseScore = " + chineseScore + ", englishScore = " + englishScore + "}";
    }
}
