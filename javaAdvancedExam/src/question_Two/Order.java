package question_Two;

import java.util.Date;

/**
 * @author 30391
 */
public class Order implements Comparable<Order> {
    private int id;
    private Date time;
    private int money;

    public Order() {
    }

    public Order(int id, Date time, int money) {
        this.id = id;
        this.time = time;
        this.money = money;
    }

    /**
     * 获取
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return time
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置
     *
     * @param time
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取
     *
     * @return money
     */
    public int getMoney() {
        return money;
    }

    /**
     * 设置
     *
     * @param money
     */
    public void setMoney(int money) {
        this.money = money;
    }

    public String toString() {
        return "Order{id = " + id + ", time = " + time + ", money = " + money + "}";
    }

    @Override
    public int compareTo(Order o) {
        return 0;
    }
}
