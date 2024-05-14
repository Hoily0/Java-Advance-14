package work;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 30391
 */
public class CjTaskTest {
    public static void main(String[] args) {

        ArrayList<String> price = new ArrayList<>();
        Collections.addAll(price, "苹果手机", "华为手机", "三洋踏板摩托", "迪拜7日游", "苹果笔记本",
                "联想笔记本", "小米空气净化器", "格力空调", "海尔冰箱", "海信电视");

        CjTask cjTask = new CjTask(price);

        Thread thread1 = new Thread(cjTask, "第一组");
        Thread thread2 = new Thread(cjTask, "第二组");

        thread1.start();
        thread2.start();
    }
}
