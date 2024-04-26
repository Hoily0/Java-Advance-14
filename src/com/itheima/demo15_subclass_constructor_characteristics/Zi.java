package com.itheima.demo15_subclass_constructor_characteristics;

/**
 * 子类
 */
public class Zi extends Fu{
    public Zi(){
        System.out.println("子类构造器");
    }

    public Zi(String name){
        System.out.println("子类构造器");
        System.out.println("name="+name);
    }
}
