package com.itheima.ex;

import javax.swing.*;

public class User {
    private String username;
    private String password;
    private int age;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException {
        if (password.length() < 6 || password.length() > 8) {
            //业务出错，抛出自定义的PasswordException
            throw new PasswordException("密码必须在6-8为之间");//编译时异常，写完之后立刻报错
        }
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0) {
            //业务出错
            throw new AgeException("年龄不合法");
        }

        this.age = age;
    }

    public User(String username, String password, int age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }
}
