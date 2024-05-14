package classes.thread;

/**
 * @author 30391
 */
public class ThreadImpl extends java.lang.Thread {


    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print(Thread.currentThread().getName() + "执行第" + i + "次     ");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
        }

    }

    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    public void interrupt() {
        super.interrupt();
    }

    @Override
    public void setContextClassLoader(ClassLoader cl) {
        super.setContextClassLoader(cl);
    }

    @Override
    public void setUncaughtExceptionHandler(UncaughtExceptionHandler eh) {
        super.setUncaughtExceptionHandler(eh);
    }
}

