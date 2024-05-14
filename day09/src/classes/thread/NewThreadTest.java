package classes.thread;

import classes.entity.Account;

/**
 * @author 30391
 */
public class NewThreadTest {
    public static void main(String[] args) throws InterruptedException {

//        ThreadImpl thread0 = new ThreadImpl();
//        ThreadImpl thread1 = new ThreadImpl();
//        ThreadImpl thread2 = new ThreadImpl();
//
////        System.out.println("thread0.getName() = " + thread0.getName());
////        thread0.setName("这是线程0新名称");
//        System.out.println("thread0.getName() = " + thread0.getName());
//        System.out.println("thread1.getName() = " + thread1.getName());
//        System.out.println("thread2.getName() = " + thread2.getName());
//
//
//
//
//
//
//
////        try {
//            thread0.start();
////            throw new RuntimeException();
////        }catch (RuntimeException runtimeException){
////        }
//        thread0.join();
//        thread1.start();//展示你的实力，
//
//        thread2.start();

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 3; i++) {
//                    System.out.println(Thread.currentThread().getName());
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        },"飞机");
//
//        Thread thread1 = new Thread(() -> {
//            for (int i = 0; i < 3; i++) {
//                System.out.println(Thread.currentThread().getName());
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//
//            }
//        },"大炮");
//
//
//        thread.start();
//        thread1.start();

//
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Account.drawBalance(100000D);
//            }
//        }, "小明");
//
//
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                Account.drawBalance(100000D);
//            }
//        }

        Account account = new Account(100000D);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                account.drawBalance(100000D);
            }
        }, "小明");


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                account.drawBalance(100000D);
            }
        };


        Thread thread1 = new Thread(runnable, "小红");

        thread.start();
        thread1.start();


    }
}
