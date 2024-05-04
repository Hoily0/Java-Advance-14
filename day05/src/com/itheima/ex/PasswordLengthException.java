package com.itheima.ex;

/*
    运行时异常
 */
public class PasswordLengthException extends RuntimeException {
    public PasswordLengthException() {
    }

    public PasswordLengthException(String message) {
        super(message);
    }
}
