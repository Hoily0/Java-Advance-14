package question_One;

/**
 * @author 30391
 */
public class Test01 {
    public static void main(String[] args) throws InterruptedException {

        Thread threadOne = new Thread(new OddTask(), "奇数线程");
        threadOne.start();
        threadOne.join();

        Thread threadTwo = new Thread(new EvenTask(), "偶数线程");
        threadTwo.start();


    }
}
