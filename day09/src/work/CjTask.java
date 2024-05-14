package work;

import java.util.List;
import java.util.Random;

/**
 * @author 30391
 */
public class CjTask implements Runnable {

    private List<String> prizeList;

    public CjTask() {
    }

    public CjTask(List<String> prizeList) {
        this.prizeList = prizeList;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (prizeList.size() <= 0) {
                    break;
                }
                String price = prizeList.remove(new Random().nextInt(prizeList.size()));

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "取出了" + price);
            }


        }
    }

    /**
     * 获取
     *
     * @return prizeList
     */
    public List<String> getPrizeList() {
        return prizeList;
    }

    /**
     * 设置
     *
     * @param prizeList
     */
    public void setPrizeList(List<String> prizeList) {
        this.prizeList = prizeList;
    }

    public String toString() {
        return "CjTask{prizeList = " + prizeList + "}";
    }
}
