package com.work.generics;

import com.work.entity.Humanity;
import com.work.entity.Manager;

/**
 * @author 30391
 */
public class MethodGeneric {

    public static void main(String[] args) {
        showGeneric(100);
        showGeneric("faes");
        showGeneric('f');
    }


    public static <Y> void showGeneric(Y y) {
        System.out.println(y);
        ;
    }


}
