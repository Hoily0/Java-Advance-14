package work;

/**
 * @author 30391
 */
public class BankDeposit {

    private static Double balance = 1000D;

    public static void main(String[] args) throws InterruptedException {


        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 1000; i = i + 100) {
                    balance += 100;
                    System.out.println(Thread.currentThread().getName() + "存入了100元。当前余额是：" + balance);
                }

            }
        };


        Thread thread1 = new Thread(runnable, "小王");
        Thread thread2 = new Thread(runnable, "小李");

        thread1.start();
        thread1.join();
        thread2.start();

    }
}
