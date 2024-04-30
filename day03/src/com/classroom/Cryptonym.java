package com.classroom;

public class Cryptonym {
    public static void main(String[] args) {
        show(new Swimming() {
            @Override
            public void swim() {
                System.out.println("游泳");
            }
        });

    }

    public static void show(Swimming swimming) {
        swimming.swim();
    }
}


interface Swimming {
    void swim();
}
