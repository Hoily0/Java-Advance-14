package com.itheima.数据结构;

/*

 */
public class Node {
    private String e;
    private Node prev;
    private Node next;

    public Node(String e) {
        this.e = e;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void add(Node n) {
        if (this.next == null) {
            next = n;
            return;
        } else {
            next.add(n);
        }
    }
}
