package com.itheima.demo14_subclass_access_members;

public class Zi extends Fu {
    String name = "子类变量名称";

    public void print1() {
        System.out.println("子类的print1方法");
    }

    public void print2() {
        //如果子类和父类出现同名变量或者方法，优先使用子类的；此时如果一定要在子类中使用父类的成员，可以加this或者super进行区分。
        System.out.println("子类的print2方法-name变量值::::" + name);
        System.out.println("子类的print2方法-this.name变量值::::" + this.name);
        System.out.println("子类的print2方法-super.name变量值::::" + super.name);

        super.print1();
    }

}
