package work;

public class AutoBoxTest {
    public static void main(String[] args) {

        /*
        自动装箱
         */
//        Integer num = 10;

        /*
        自动拆箱
        进行运算时，自动将包装类型转换为基本类型
         */
//        num = num + 1;


        /*
        底层实现
        自动装箱是调用了 int 的 valueOf方法将基本类型转为包装类型
        自动拆箱是调用了 Integer 的 intValue方法将包装类型转为基本类型
         */


        String s = "10,50,30,20,40";//trim去空格
        String[] split = s.split(",");

        int max = Integer.parseInt(split[0]);
//        System.out.println(max);
        for (String string : split) {

            if (max < Integer.parseInt(string)) {
                max = Integer.parseInt(string);
            }
        }
        System.out.println(max);


    }
}
