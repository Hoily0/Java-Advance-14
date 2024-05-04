package com.work.entity;

public class Phone {
    private String brand;
    private double price;
    public final static int size = 6;

    public void sendMessage() {
        System.out.println("发短信");
    }

    public void call() {
        System.out.println("打电话");
    }

    public void playGame() {
        System.out.println("玩游戏");
    }

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    /**
     * 获取
     *
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     *
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Phone{brand = " + brand + ", price = " + price + "}";
    }
}
