package online.test;

/**
 * @author 30391
 */
public class variableParameterTest {
    public static void main(String[] args) {

        getSum(10, 20, 203, 40);
    }

    public static void getSum(int... nums) {
        int and = 0;
        for (int num : nums) {
            and += num;
        }
        System.out.println("and = " + and);


    }

}
