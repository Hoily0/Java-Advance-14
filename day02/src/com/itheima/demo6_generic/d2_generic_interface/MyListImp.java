package com.itheima.demo6_generic.d2_generic_interface;

// 实现类: 实现接口的时候指定接口泛型的具体数据类型
public class MyListImp implements MyList<String> {
    @Override
    public void add(String s) {
        System.out.println("s = " + s);
    }
}
