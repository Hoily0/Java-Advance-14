package com.classroom;

public class CodeBlock {
    static {
        int count = 0;
        System.out.println("这是静态代码块");
    }

    {
        System.out.println("构造方法代码块/实例代码块");
    }

    public static void main(String[] args) {


        {
            System.out.println("这是方法代码块");
        }


    }


}
