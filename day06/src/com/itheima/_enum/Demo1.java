package com.itheima._enum;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
    枚举主要作用，就是给程序员做选择的。
    你只能去枚举中选择一个对象来使用，不能自己是随便new。
 */
public class Demo1 {
    public static void main(String[] args) {
        showGender(Gender.MAN);
    }

    //方法参数，是字符串变量，无法约束调用者行为，调用者随便传
    //枚举，只能让程序员选择
    public static void showGender(Gender gender) {
        if (gender == Gender.WOMAN) {
            System.out.println("女士你好");
        } else {
            System.out.println("老板你好");
        }
    }
}

//99% 都这样的
enum Gender {
    MAN, WOMAN;
}
