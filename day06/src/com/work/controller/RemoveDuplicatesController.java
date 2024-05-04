package com.work.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author 30391
 */
public class RemoveDuplicatesController {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        String[] strings = {"a", "f", "b", "c", "a", "d"};
        Collections.addAll(list, strings);

        System.out.println("去重之前：" + list);

        HashSet<String> set = new HashSet<>(list);
        System.out.println("去重之后：" + set);


    }

}
