package com.itheima.no_name_class;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Test2 {
    public static void main(String[] args) {
        // 创建窗体对象
        JFrame frame = new JFrame();
        // 设置窗体大小
        frame.setBounds(100, 200, 300, 400);
        // 创建按钮对象
        JButton btn = new JButton("点我!");
        // 将按钮添加到窗体
        frame.getContentPane().add(btn);

        // 为按钮注册监听(监视)
        // 情况: 我调用方法, 形参跟我要接口, 我需要传入实现类对象
        // 选择1: 手动编写实现类 : 重写的方法很多
        // 选择2: 传入匿名内部类 : 重写的方法很少(1~2)
        btn.addMouseListener(new MouseListenerImpl());

        // 设置窗体可见
        frame.setVisible(true);
    }
}
