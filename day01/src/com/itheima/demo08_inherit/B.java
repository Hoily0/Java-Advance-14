package com.itheima.demo08_inherit;

public class B extends A {

    public String publicSonVariable = "子类";
    public String publicFatherVariable = "父类";
    public int num = 10;


    public void publicSonMethods() {
        System.out.println("子类公开方法");
    }

//    private void privateMethods(){
//        System.out.println("私有方法");
//    }

}
