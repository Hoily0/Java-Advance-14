package com.itheima.数据结构;

public class School {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public School() {
    }

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
