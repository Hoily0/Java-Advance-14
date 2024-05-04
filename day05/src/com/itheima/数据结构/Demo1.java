package com.itheima.数据结构;

public class Demo1 {
    public static void main(String[] args) {
        Node node1 = new Node("张三");
        Node node2 = new Node("李四");
        Node node3 = new Node("王五");
        Node node4 = new Node("赵六");
        Node node5 = new Node("天气");
        Node node6 = new Node("周八");
        //建立链表的关系
        node1.add(node2);
        node1.add(node3);
        node1.add(node4);
        node1.add(node5);
        node1.add(node6);

        printLink(node1);
    }

    private static void printLink(Node node1) {
        if (node1 != null) {
            System.out.println(node1.getE());
            printLink(node1.getNext());
        } else {
            return;
        }
    }

    private static void method1() {
        Student student = new Student();
        student.setName("tom");
        student.setAge(18);

        School school = new School();
        school.setName("深圳中学");
        school.setAddress("深圳..");

        student.setSchool(school);

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSchool().getName());
        System.out.println(student.getSchool().getAddress());
    }
}
