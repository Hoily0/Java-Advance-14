package com.itheima.demo05_precautions_for_method_use;

/**
 * 使用类方法、实例方法时的几点注意事项
 * 类方法中可以直接访问类的成员，不可以直接访问实例成员。
 * 实例方法中既可以直接访问类成员，也可以直接访问实例成员。
 * 实例方法中可以出现this关键字，类方法中不可以出现this关键字的。
 */
public class Student {
    static String name;//类中成员变量|静态成员变量
    double score;//实例成员变量|对象成员变量

    /**
     * 类方法中可以直接访问类的成员，不可以直接访问实例成员。
     * <p>
     * 类方法中不可以出现this关键字的
     */
    public static void printHelloWorld1() {
        System.out.println("name = " + name);//类成员变量
        printHelloWorld2();//类成员方法

        //System.out.println("score = " + score);//实例成员变量
        //printHelloWorld3();//实例成员方法

        //System.out.println("this.name = " + this.name); //方法中不可以出现this关键字的
        //System.out.println("this.score = " + this.score);//方法中不可以出现this关键字的
        //this.printHelloWorld2();//方法中不可以出现this关键字的
        //this.printHelloWorld3();//方法中不可以出现this关键字的
        //this.printHelloWorld4();//方法中不可以出现this关键字的
    }


    public static void printHelloWorld2() {

    }


    /**
     * 实例方法中既可以直接访问类成员，也可以直接访问实例成员。
     * <p>
     * 实例方法中可以出现this关键字
     */
    public void printHelloWorld3() {
        System.out.println("name = " + name);//类成员变量
        System.out.println("score = " + score);//实例成员变量

        printHelloWorld1();//类成员方法
        printHelloWorld2();//类成员方法
        printHelloWorld4();//实例成员方法

        System.out.println("this.name = " + this.name);//类成员变量           实例方法中可以出现this关键字
        System.out.println("this.score = " + this.score);//对象成员变量        实例方法中可以出现this关键字
        this.printHelloWorld1();//类成员方法                                  实例方法中可以出现this关键字
        this.printHelloWorld2();//类成员方法                                  实例方法中可以出现this关键字
        this.printHelloWorld4();//实例成员方法                                 实例方法中可以出现this关键字
    }


    public void printHelloWorld4() {

    }

}
