package com.work;

import com.work.entity.*;
import com.work.service.Service;

public class Work {
    public static void main(String[] args) {

//        Service service = new Service();
//
//        service.work1();
//
        Service.work2();
//
//        Student.printHelloWorld();
//        Student student = new Student();
//        student.printPass();
//
//        MyUtils myUtils = new MyUtils();
//         String number = String.valueOf(myUtils.createCode());
//        System.out.println(number);
//
//        System.out.println(schoolName);
//
//        Student s1 = new Student();
//        Student s2 = new Student();
//
//        HungryChineseSingleton hungryChineseSingleton1 = HungryChineseSingleton.getObject();
//        HungryChineseSingleton hungryChineseSingleton2 = HungryChineseSingleton.getObject();
//        System.out.println(hungryChineseSingleton1);
//        System.out.println(hungryChineseSingleton2);
//
//        LazySingleton lazySingleton = LazySingleton.getLazySingleton();
//        LazySingleton lazySingleton1 = LazySingleton.getLazySingleton();
//        System.out.println(lazySingleton1 == lazySingleton);

        Animal animal = new Animal();
        animal.move(678969);
        Dog dog = new Dog();
        dog.move(1234);

        Stutend stutend = new Stutend("小明", 12, "六年级");
        System.out.println(stutend);


    }


}
