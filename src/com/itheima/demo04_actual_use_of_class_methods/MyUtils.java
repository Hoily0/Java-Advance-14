package com.itheima.demo04_actual_use_of_class_methods;

import java.util.Random;

public class MyUtils {

    private MyUtils(){

    }

    public static String getCode(int n){
        //1.1 定义String类型的变量 存验证码
        String code = "";
        //1.2 n循环生成验证码的字符
        Random random = new Random();
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < n; i++) {
            //1.3 随机生成字符
            int index = random.nextInt(data.length());//随机范围一定在data长度中
            //1.3.1 根据index索引（下标）找到data字符串中的字符
            char c = data.charAt(index);
            //1.4 拼接给code字符串
            code += c;
        }
        return code;
    }
}
