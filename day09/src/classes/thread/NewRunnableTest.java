package classes.thread;

/**
 * @author 30391
 */
public class NewRunnableTest {
    public static void main(String[] args) {

//        java.lang.Thread thread = new java.lang.Thread(new RunnableImpl());
//        thread.start();
//        for (int i = 0; i < 1000; i++) {
//            System.out.print("这是酷酷酷酷酷酷，mlfsakme");
//        }

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程运行了");
            }
        });
        thread.start();

    }
}
