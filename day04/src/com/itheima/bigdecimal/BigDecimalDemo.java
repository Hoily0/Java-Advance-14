package com.itheima.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    /*
        BigDecimal类 : 解决小数运算的不精确问题

            1. 创建对象 : 将需要运算的小数, 封装为BigDecimal对象

                public BigDecimal(double val) : 不建议使用, 不能保证运算的精确
                ------------------------------------------------------------------------
                public BigDecimal(String val) : 可以保证运算精确

                            BigDecimal bd1 = new BigDecimal("0.1");
                            BigDecimal bd2 = new BigDecimal("0.2");

                public static BigDecimal valueOf(double val) : 可以保证运算精确

                            BigDecimal bd1 = BigDecimal.valueOf(0.1);
                            BigDecimal bd2 = BigDecimal.valueOf(0.2);

            2. 运算 (+ - * /)

                double result1 = bd1.add(bd2).doubleValue();
                double result2 = bd1.subtract(bd2).doubleValue();
                double result3 = bd1.multiply(bd2).doubleValue();
                double result4 = bd1.divide(bd2).doubleValue();

                public BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode)  :

                            参数1 : 跟谁做运算
                            参数2 : 保留小数点多少位
                            参数3 : 舍入模式   (RoundingMode.HALF_UP,  RoundingMode.UP, RoundingMode.DOWN)
                                                四舍五入                进一法                去尾法


     */
    public static void main(String[] args) {
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.0);

        double v1 = bd1.divide(bd2, 2, RoundingMode.HALF_UP).doubleValue();
        System.out.println(v1);

        double v2 = bd1.divide(bd2, 2, RoundingMode.UP).doubleValue();
        System.out.println(v2);

        double v3 = bd1.divide(bd2, 2, RoundingMode.DOWN).doubleValue();
        System.out.println(v3);
    }

}
