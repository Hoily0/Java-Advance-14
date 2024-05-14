package work;

/**
 * @author 30391
 */
public class RepeatedCopying {
    static Object lock = new Object();
    static int count = 100;

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < count; count--) {
                        System.out.println(Thread.currentThread().getName() + "抄写一遍 HelloWorld，两人总共还要抄写" + (count - 1));
                    }
                }
            }
        };


        Thread thread1 = new Thread(runnable, "小明线程");
        Thread thread2 = new Thread(runnable, "小王线程");


        thread1.start();
        thread2.start();
    }
}
