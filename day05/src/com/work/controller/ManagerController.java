package com.work.controller;

import com.work.entity.Manager;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 30391
 */
public class ManagerController {

    public static void main(String[] args) {

        ArrayList<Manager> list = new ArrayList<>();

        Manager managerOne = new Manager("屁哦昂", 23, 86);
        Manager managerTwo = new Manager("分爱上", 27, 77);
        Manager managerThere = new Manager("啊是不能", 93, 0);
        Manager managerFlour = new Manager("弄i阿飞", 17, 9219);
        Manager managerFive = new Manager("冯傲松", 35, 9);

        list.add(managerOne);
        list.add(managerTwo);
        list.add(managerThere);
        list.add(managerFlour);
        list.add(managerFive);


        Iterator<Manager> iterator = list.iterator();
        double max = 0, min = 0, total = 0, average = 0;
        for (Manager manager : list) {
            if (manager.getScore() > max) {
                max = manager.getScore();
            }
            if (manager.getScore() < min) {
                min = manager.getScore();
            }
            total += manager.getScore();
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("total = " + total);
        System.out.println("average = " + (total / list.size()));
    }
}
