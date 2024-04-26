package com.itheima.demo10_permission_modifier.child;

import com.itheima.demo10_permission_modifier.Fu;

/**
 * 不同包子孙类
 */
public class Test2 extends Fu {
    public void test() {
        //privateMethod(); //私有方法无法访问
        //method();
        protectedMethod();//不同包子孙类
        publicMethod();//不同包子孙类
    }

    public static void main(String[] args) {
        Test2 zi = new Test2();
        zi.test();
    }
}
