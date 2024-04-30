package com.itheima.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest3 {
    /*
        需求：请把下面文本中的电话，邮箱，座机号码，热线都爬取出来。

        public static Pattern compile(String regex) : 将正则表达式封装为对象
     */
    public static void main(String[] args) {
        String data = "来黑马程序员学习Java，" + "电话：18666668888，18699997777或者联系"
                + "邮箱：boniu@itcast.cn 邮箱：bozai@itcast.cn 邮箱2：dlei0009@163.com"
                + "座机电话：01036517895，010-98951256 "
                + "热线电话：400-618-9090 ，400-618-4000，4006184000，4006189090";

        String regex = "[1][3-9]\\d{9}|[\\w]+@[\\w&&[^_]]{2,10}(\\.[a-z]{2,3})+|0\\d{2,3}-?\\d{8}|400-?\\d{3}-?\\d{4}";

        // 1. 将正则表达式封装为对象
        Pattern pattern = Pattern.compile(regex);

        // 2. 调用对象的方法, 获取匹配器对象
        Matcher matcher = pattern.matcher(data);

        // 循环的查找
        while (matcher.find()) {
            // 满足条件进入循环, 说明找到了
            // 调用方法, 将找到的内容获取出来
            String s = matcher.group();
            System.out.println(s);
        }
    }
}
