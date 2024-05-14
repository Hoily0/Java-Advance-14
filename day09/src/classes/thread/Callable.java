package classes.thread;

/**
 * @author 30391
 */
public class Callable implements java.util.concurrent.Callable {
    @Override
    public Object call() throws Exception {
        int add = 0;
        for (int i = 0; i < 20; i++) {
            add += (int) Math.pow(2, 20);
        }
        return add;
    }
}
