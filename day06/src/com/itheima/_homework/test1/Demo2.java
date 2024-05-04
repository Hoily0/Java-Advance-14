package com.itheima._homework.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/*
    throws ParseException：把已经出现的异常往上抛
    throw new 异常();  制造的一个异常

    处理异常：
        编译时异常处理：
            1.try...catch   自己内部处理异常，并保证程序继续执行。
            2.throws声明在方法上，自己不处理异常，把异常往上抛出
        运行时异常处理：
            1.try...catch   自己内部处理异常，并保证程序继续执行。
            2.throws声明在方法上，自己不处理异常，把异常往上抛出。（默认省略）
 */
public class Demo2 {
    //张三
    public static void main(String[] args) {
       /* String s =null;
        s.length();*/

        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.parse("2020-11-11");*/
        ArrayList<String> list = new ArrayList<>();
        try {
            submitOrder(list);
        } catch (Exception e) {
            //打印输出模拟，张三给浏览器用户提示
            String message = e.getMessage();
            System.out.println(message);//返回给浏览器用户
        }


    }

    //李四
    //提交订单,异常可以返回数据(抛)
    public static double submitOrder(ArrayList<String> shoppingCart) {
        if (shoppingCart != null || shoppingCart.size() == 0) {
            throw new OrderException("您购物车是空的，请选购再下单");
        }

        //如果传入的集合没有存储任何元素，我就要抛出异常
        System.out.println("提交订单成功");
        return 0;
    }
}


