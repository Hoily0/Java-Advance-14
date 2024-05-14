package question_One;

/**
 * @author 30391
 */
public class OddTask implements Runnable {


    @Override
    public void run() {

//        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
