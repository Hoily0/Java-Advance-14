package com.itheima.demo15_subclass_constructor_characteristics;

/**
 * 特点：
 * 子类的全部构造器，都会先调用父类的构造器，再执行自己。
 * 原理：
 * 子类全部构造器的第一行代码都隐含（写不写都有）了super()，它会调用父类的无参数构造器。
 * 意义：
 * 创建子类对象,需要优先初始化父类成员变量,确保若子类中需要对父类成员变量操作时，该变量已确保存在。
 * 注意事项：
 * super(…)必须放在构造器的第一行，否则报错
 * 如果父类没有无参构造器，则必须在子类构造器的第一行手写super(实参)，指定去调用父类的有参数构造器。
 */
public class Fu {
    String name = "小红";

    public Fu() {
        System.out.println("父类构造器");
    }

}
