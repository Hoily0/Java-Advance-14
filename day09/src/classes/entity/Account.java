package classes.entity;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 李扁扁
 */
public class Account {
    private Double balance;

    public ReentrantLock lock = new ReentrantLock();

    public void drawBalance(Double balance) {
        String name = Thread.currentThread().getName();
        lock.lock();
        try {
            if (this.balance >= balance) {
                System.out.println(name + "取走了" + balance);
                this.balance -= balance;
                System.out.println("剩余余额" + (this.balance));
            } else {
                System.out.println("余额不足");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }


    public Account() {
    }

    public Account(Double balance) {
        this.balance = balance;
    }

    /**
     * 获取
     *
     * @return balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * 设置
     *
     * @param balance
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Account{balance = " + balance + "}";
    }

//    private static Double balance = 100000D;
//    public static synchronized void drawBalance(Double b){
//        String name = Thread.currentThread().getName();
//
//
//            if (balance >= b){
//                System.out.println(name + "取走了" + balance);
//                balance -= b;
//                System.out.println("剩余余额" + (balance));
//            }else {
//                System.out.println("余额不足");
//            }
//
//    }
}
