package work.multiPeopleCommunication;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 30391
 */
public class test {
    public final String lockOne = null;

    public void testOne() {
        synchronized (lockOne) {

        }
    }


    public synchronized void syncedTwo() {
        //共享代码
    }

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            //共享代码
        } finally {
            lock.unlock();
        }


    }


}
