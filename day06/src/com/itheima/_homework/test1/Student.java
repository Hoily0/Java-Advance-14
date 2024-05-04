package com.itheima._homework.test1;

public class Student {
    private String name;
    private int age;
    private int mathScore;
    private int englishScore;
    private int yuwenScore;

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
        if (age > 120 || age < 0) {
            //抛出异常，告诉你
            throw new AgeException("年龄不合法");//一旦抛异常，当前方法就结束了
        }
        this.age = age;
    }

    public Student() {
    }

    public int getMathScore() {
        return mathScore;
    }

    public void checkScore(int score) {
        if (score > 100 || score < 0) {
            throw new ScoreException("成绩不合法：" + score);
        }
    }

    public void setMathScore(int mathScore) {
        checkScore(mathScore);
        //判断传入的成绩是否合法
        this.mathScore = mathScore;
    }

    public int getEnglishScore() {

        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        checkScore(mathScore);
        this.englishScore = englishScore;
    }

    public int getYuwenScore() {
        return yuwenScore;
    }

    public void setYuwenScore(int yuwenScore) {
        checkScore(mathScore);
        this.yuwenScore = yuwenScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mathScore='" + mathScore + '\'' +
                ", englishScore='" + englishScore + '\'' +
                ", yuwenScore='" + yuwenScore + '\'' +
                '}';
    }
}
