package com.itheima.test;

public class RegexTest1 {
    /*
        1. QQ号正则
                不能以0开头
                5~12位
                全部都是数字
        2. 手机号正则
                必须是1开头
                第二位:  3 4 5 6 7 8 9
                全都是数字, 必须是11位
        3. 邮箱正则
                zhangSan@itcast.cn
                zhangsan@163.com
                123456@qq.com
                zhangsan@sina.com
                zhangsan@itcast.qq.com
                zhangsan@xxx.edu
                zhangsan@xxx.org

     */
    public static void main(String[] args) {
        String qqRegex = "[1-9]\\d{4,11}";
        System.out.println("123456".matches(qqRegex));

        String telRegex = "[1][3-9]\\d{9}";
        System.out.println("15612345555".matches(telRegex));

        String emailRegex = "[\\w]+@[\\w&&[^_]]{2,10}(\\.[a-z]{2,3})+";
        System.out.println("zhangsan@itcast.qq.com".matches(emailRegex));
    }
}
