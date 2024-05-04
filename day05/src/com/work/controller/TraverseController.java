package com.work.controller;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author 30391
 */
public class TraverseController {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");

        iteratorObject(list);

        strengthenTheForLoop(list);

        anonymousInnerClass(list);

        lambdaExpression(list);


    }

    private static void lambdaExpression(ArrayList<String> list) {
        list.forEach(System.out::println);

    }

    private static void anonymousInnerClass(ArrayList<String> list) {
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string);
            }
        });
    }

    private static void strengthenTheForLoop(ArrayList<String> list) {
        for (String index : list) {
            System.out.println(index);
        }

    }

    private static void iteratorObject(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }

    }

}
