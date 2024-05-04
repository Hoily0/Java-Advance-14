package com.work.controller;

import java.util.ArrayList;

/**
 * @author 30391
 */
public class GenericWildcard {
    public static void main(String[] args) {

        ArrayList<C> arrayList = new ArrayList<>();
        show(arrayList);
//        show2(arrayList);
    }

    public static void show(ArrayList<? extends B> list) {

    }

    public static void show2(ArrayList<? super B> list) {

    }


}

class A {
}

class B extends A {
};

class C extends B {
};

class D extends C {
};