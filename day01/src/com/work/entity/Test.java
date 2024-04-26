package com.work.entity;

public class Test {
    private static Test test;

    private Test() {

    }

    public static Test getTest() {
        if (test == null) {
            test = new Test();
        }
        return test;
    }
}
