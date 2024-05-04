package com.itheima.ex;

public class Demo6 {
    public static void main(String[] args) {
        try {
            saveUser("tom", "123");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("采用默认注册user");
            saveUser("admin", "123456");
        }
    }

    public static void saveUser(String username, String password) {
        //业务：密码长度 6-8 之间
        if (password.length() < 6 || password.length() > 8) {
            throw new PasswordLengthException("密码长度只能是6-8之间，而你写的是:" + password.length());
        }

        System.out.println("添加账户成功");
    }
}
