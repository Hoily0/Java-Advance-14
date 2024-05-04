package com.itheima.ex;

import java.util.Scanner;

/*
    发现：程序正常执行，但是业务不符合逻辑。
    遇到这样的情况，我们应该抛出业务异常来提醒调用者

    没有项目，没有业务
 */
public class Demo5 {
    public static void main(String[] args) {
        //键盘录入数据，组合成USer对象，并打印
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名:");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        //组装对象
        User user = new User();
        user.setUsername(username);
        try {
            user.setPassword(password);
        } catch (PasswordException e) {
            //编译时异常，非常严格，还没运行就已经在强烈提醒可能这个代码有问题
            //你得提前做好b计划的处理、
            e.printStackTrace();
            try {
                user.setPassword("123456");
            } catch (PasswordException ex) {
                ex.printStackTrace();
            }
        }
        try {
            user.setAge(age);
        } catch (Exception e) {
            user.setAge(10);
        }
        //打印对象
        System.out.println(user);
    }
}
