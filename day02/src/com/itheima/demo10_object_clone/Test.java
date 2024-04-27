package com.itheima.demo10_object_clone;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        double[] arr = {99.0, 99.5};
        Student s = new Student(1, "zhangsan", "wo666", arr);
        System.out.println("s = " + s);

        // 浅克隆
        Object obj = s.clone();
        System.out.println("obj = " + obj);

        // 深克隆
        // 先克隆对象
        Student s1 = (Student) s.clone();
        // 然后再克隆对象中的数组
        double[] cloneScores = s1.getScores().clone();
        // 把克隆出来的数组赋值到克隆对象中的scores数组变量
        s1.setScores(cloneScores);
        System.out.println("s1 = " + s1);

        double[] scoresArr = s1.getScores();
        for (int i = 0; i < scoresArr.length; i++) {
            System.out.println(scoresArr[i]);
        }

    }
}
