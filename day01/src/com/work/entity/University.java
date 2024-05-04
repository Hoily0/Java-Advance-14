package com.work.entity;

public class University {
    private String name;
    private double scoreRule;

    public University() {

    }

    public University(String name, double scoreRule) {
        this.name = name;
        this.scoreRule = scoreRule;
    }

    public void enterRule(Stutent stutent) {
        if (stutent.getScore() > this.scoreRule) {
            System.out.println("张三同学口试分数为" + stutent.getScore() +
                    "分，达到了分数线80分，" + getName() + "准予录取");
        } else {
            System.out.println("张三同学考试分数为" + stutent.getScore() +
                    "分，未到了分数线80分，" + getName() + "不予录取并狠狠的批评");
        }
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
     * @return scoreRule
     */
    public double getScoreRule() {
        return scoreRule;
    }

    /**
     * 设置
     *
     * @param scoreRule
     */
    public void setScoreRule(double scoreRule) {
        this.scoreRule = scoreRule;
    }

    public String toString() {
        return "University{name = " + name + ", scoreRule = " + scoreRule + "}";
    }
}
