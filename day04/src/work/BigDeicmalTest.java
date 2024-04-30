package work;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author 30391
 */
public class BigDeicmalTest {
    public static void main(String[] args) {

        BigDecimal num1 = new BigDecimal("0.5");
        BigDecimal num2 = new BigDecimal("-3");

        System.out.println("num1.add(num2) = " + num1.add(num2));
        System.out.println("num1.subtract(num2) = " + num1.subtract(num2));
        System.out.println("num1.multiply(num2) = " + num1.multiply(num2));
        System.out.println("num2.divide(num1).abs() = " + num2.divide(num1).abs());
        System.out.println("num1.divide(num2,4, RoundingMode.UP) = " + num1.divide(num2, 10, RoundingMode.UP));
        System.out.println("num1.divide(num2, 10, RoundingMode.DOWN) = " + num1.divide(num2, 10, RoundingMode.DOWN));
        System.out.println("num1.divide(num2, RoundingMode.HALF_DOWN) = " + num1.divide(num2, RoundingMode.HALF_DOWN));
        System.out.println("num1.divide(num2, RoundingMode.UP) = " + num1.divide(num2, RoundingMode.HALF_UP));
//        num1.compareTo()


    }
}
