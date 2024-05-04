package com.itheima.no_name_class;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerImpl implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("点击了");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("鼠标按下了");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("鼠标松开了");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标滑入了");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标滑出了");
    }
}
