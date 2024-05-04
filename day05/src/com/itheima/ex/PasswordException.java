package com.itheima.ex;

/*
    编译时(基本不用)
 */
public class PasswordException extends Exception {
    public PasswordException() {
    }

    public PasswordException(String message) {
        super(message);
    }
}
