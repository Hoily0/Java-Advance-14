package work;

public class RecursionTest {
    public static void main(String[] args) {

//        int result = recursion(99);
//        System.out.println("result = " + result);

        int fibonacci = Fibonacci(20);

    }


//    public static int recursion(int num){
//
//        if (num == 1){
//            return 1;
//        }
//        num += recursion(num - 1);
//
//
//
//        return num;
//    }


    public static int Fibonacci(int upperLimit) {
        if (upperLimit < 0) {
//            return
        }
        return 2 * Fibonacci(upperLimit / 3 - 1);


    }
}
