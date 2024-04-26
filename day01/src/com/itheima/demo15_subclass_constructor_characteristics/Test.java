package com.itheima.demo15_subclass_constructor_characteristics;

public class Test {
    public static void main(String[] args) {
        //子类的全部构造器，都会先调用父类的构造器，再执行自己。
        //Zi z = new Zi();
        Zi z1 = new Zi("xxxx");

        System.out.println("z1.name = " + z1.name);
    }
}
