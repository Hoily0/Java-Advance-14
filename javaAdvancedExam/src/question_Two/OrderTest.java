package question_Two;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 30391
 */
public class OrderTest {
    public static void main(String[] args) throws ParseException {

        ArrayList<Order> orders = new ArrayList<>();


        createOrder(3, orders).sort((o1, o2) -> o2.getMoney() - o1.getMoney());
        System.out.println("排序后的订单为");
        traverse(orders);
        System.out.println("总金额：" + getLumpSum(orders));


    }

    private static void traverse(ArrayList<Order> orders) {
        for (Order order : orders) {
            System.out.println("order = " + order);
        }
    }

    private static int getLumpSum(ArrayList<Order> orders) {
        int sum = 0;
        for (Order order : orders) {
            sum += order.getMoney();
        }
        return sum;

    }

    private static ArrayList<Order> createOrder(int number, ArrayList<Order> orders) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < number; i++) {
            System.out.println("请输入一个订单的信息（格式为：订单号，订单时间，订单金额）");
            String next = scanner.next();
            String[] split = next.split(",");

            int id = Integer.parseInt(split[0]);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date time = simpleDateFormat.parse(split[1]);

            int money = Integer.parseInt(split[2]);

            orders.add(new Order(id, time, money));
        }
        return orders;

    }


}
