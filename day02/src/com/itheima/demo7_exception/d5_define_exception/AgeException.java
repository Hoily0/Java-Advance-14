package com.itheima.demo7_exception.d5_define_exception;

// 运行异常
public class AgeException extends RuntimeException {
    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }
}
