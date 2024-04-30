package work.entity;

public class Amount {
    private double amount;

    public Amount() {
    }

    public Amount(double amount) {
        this.amount = amount;
    }

    /**
     * 获取
     *
     * @return amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * 设置
     *
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String toString() {
        return "Amount{amount = " + amount + "}";
    }
}
