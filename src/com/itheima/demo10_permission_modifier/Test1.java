package com.itheima.demo10_permission_modifier;

/**
 * 同一个包中的类
 */
public class Test1 {
    public static void main(String[] args) {
        Fu f = new Fu();
        //f.privateMethod(); //私有方法无法访问
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
