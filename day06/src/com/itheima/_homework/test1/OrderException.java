package com.itheima._homework.test1;

public class OrderException extends RuntimeException {
    public OrderException() {
    }

    //创建异常对象的时候，可以指定异常信息，这个信息会被保存到父类成员位置。
    public OrderException(String message) {
        super(message);
    }
}
