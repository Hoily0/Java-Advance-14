package question_One;

/**
 * @author 30391
 */
public class EvenTask implements Runnable {

    @Override
    public void run() {

//        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
