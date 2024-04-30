package com.itheima.demo08_inherit;

/**
 * Java中提供了一个关键字extends，用这个关键字，可以让一个类和另一个类建立起父子关系。
 * 子类能继承父类的非私有成员（成员变量、成员方法）。
 * 子类的对象是由子类、父类共同完成的。
 */
public class A {
    public String publicFatherVariable = "父类";
    private String privateFatherVariable;
    public int num = 100;

    public void publicFatherMethods() {
        System.out.println("父类公开方法");
    }

    public void publicMethods() {
        System.out.println("公开方法");
    }

    protected void protectedMethods() {
        System.out.println("受保护的方法");
    }

    void defaultMethods() {
        System.out.println("默认方法");
    }

    public void privateMethods() {
        System.out.println("私有方法");
    }

    private void privateFatherMethods() {
        System.out.println("子类公开方法");
    }


}
