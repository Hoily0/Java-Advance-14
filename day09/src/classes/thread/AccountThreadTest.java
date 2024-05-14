package classes.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author 30391
 */
public class AccountThreadTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        AccountCallable callable = new AccountCallable();
        FutureTask futureTask = new FutureTask(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println("futureTask.get() = " + futureTask.get());

        Thread thread1 = new Thread(futureTask);
        thread1.start();
        System.out.println("futureTask.get() = " + futureTask.get());


    }
}
