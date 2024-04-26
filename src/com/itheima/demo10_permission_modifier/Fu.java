package com.itheima.demo10_permission_modifier;

/**
 * 什么是权限修饰符？
 *      用来限制类中的成员（成员变量、成员方法、构造器、代码块…）能够被访问的范围
 *      private      同一个类中
 *      缺省          同一个类中   同一个包中的类
 *      protected    同一个类中   同一个包中的类  不同包子孙类
 *      public       同一个类中   同一个包中的类  不同包子孙类 不同包无关类
 */
public class Fu {

    /**
     * 私有方法
     */
    private void privateMethod(){
        System.out.println("私有方法 同一个类中");
    }

    /**
     * 缺省
     */
    void method(){
        System.out.println("缺省方法 同一个类中   同一个包中的类");
    }

    /**
     * 受保护方法
     */
    protected void protectedMethod(){
        System.out.println("受保护方法 同一个类中   同一个包中的类  不同包子孙类");
    }

    /**
     * 公开方法
     */
    public void publicMethod(){
        System.out.println("公开的方法 同一个类中   同一个包中的类  不同包子孙类 不同包无关类");
    }


    public void test(){
        privateMethod();
        method();
        protectedMethod();
        publicMethod();
    }
}
