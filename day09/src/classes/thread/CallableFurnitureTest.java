package classes.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author 30391
 */
public class CallableFurnitureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<Integer> futureTask = new FutureTask<Integer>(new Callable());
        Thread thread = new Thread(futureTask);


        thread.start();
        System.out.println(futureTask.get());
    }
}
