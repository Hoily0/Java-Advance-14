package work;

/**
 * @author 30391
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("fibonacci(30) = " + fibonacci(20));
    }


    public static int fibonacci(int months) {
        if (months == 1 || months == 2) {
            return months;
        }
        return fibonacci(months - 1) + fibonacci(months - 2);
    }
}