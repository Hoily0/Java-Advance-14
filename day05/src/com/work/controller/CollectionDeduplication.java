package com.work.controller;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author 30391
 */
public class CollectionDeduplication {
    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<>();
        HashSet<String> list = new HashSet<>();

        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        System.out.println("list = " + list);
//        System.out.println("removeDuplicates(list) = " + removeDuplicates(list));

    }

    private static ArrayList<String> removeDuplicates(ArrayList<String> list) {
        ArrayList<String> list1 = new ArrayList<>();
        for (String string : list) {
            if (!list1.contains(string)) {
                list1.add(string);
            }
        }
        return list1;
    }


}
