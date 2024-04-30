package com.itheima.regex;

public class RegexDemo1 {
    /*
        正则表达式介绍 : 本质来说就是一个字符串, 字符串中可以指定规则, 来对其他字符串进行校验.

            public boolean matches(String regex) : 根据传入的正则表达式, 来对字符串进行校验, 返回true, false
     */
    public static void main(String[] args) {

        String telRegex = "1[3-9]\\d{9}";

        String tel = "15612341234";
//        1[2-9]{5}\\d{4}

        System.out.println(tel.matches(telRegex));

    }
}
