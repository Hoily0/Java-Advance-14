package com.work.entity;

public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {

    }

    public static LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();              //用时才创建
        }
        return lazySingleton;
    }


}
