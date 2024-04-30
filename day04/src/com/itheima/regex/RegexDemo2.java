package com.itheima.regex;

public class RegexDemo2 {
    /*
        \ : 转义字符
     */
    public static void main(String[] args) {

        String regex = "[a]{3,5}";

        String s = "aaaa";

        System.out.println(s.matches(regex));
    }
}
