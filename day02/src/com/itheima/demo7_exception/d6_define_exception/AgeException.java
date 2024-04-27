package com.itheima.demo7_exception.d6_define_exception;

// 编译异常
public class AgeException extends Exception {
    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }
}
