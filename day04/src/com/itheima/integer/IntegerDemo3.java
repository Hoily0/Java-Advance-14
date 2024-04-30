package com.itheima.integer;

public class IntegerDemo3 {
    /*
        public static int parseInt(String s) : 将数字字符串, 转换为数字
        ------------------------------------------------------------------

                字符串 ---> 基本数据类型

                            Byte.parseByte("123");
                            Short.parseShort("123");
                            Integer.parseInt("123");
                            Long.parseLong("123");
                            Float.parseFloat("12.3");
                            Double.parseDouble("12.3");
                            Boolean.parseBoolean("true");

                            注意: Character内部不存在parseXxx方法

                基本数据类型 ---> 字符串

                            int num = 10;

                            方案1 : String s = num + "";
                            方案2 : String.valueOf(数据);

     */
    public static void main(String[] args) {

        int num = Integer.parseInt("123");

        double v = Double.parseDouble("12.3");
        System.out.println(v + 100);

        System.out.println(num + 100);

    }
}
