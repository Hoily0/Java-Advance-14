package com.itheima.demo14_subclass_access_members;

/**
 * 1、在子类方法中访问成员（成员变量、成员方法），是依照就近原则的。
 *    先子类局部范围找。
 *    然后子类成员范围找。
 *    然后父类成员范围找，如果父类范围还没有找到则报错。
 */
public class Fu {
    String name="父类变量名称";

    public void print1() {
        System.out.println("父类的print1方法");
    }
}
