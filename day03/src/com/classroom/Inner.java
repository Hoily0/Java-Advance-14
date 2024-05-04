package com.classroom;

import javax.lang.model.element.NestingKind;

public class Inner {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.sendMessage();

        inner.InOnOut();


    }

    public void testSendMessage() {
        Outer.Inner inner = new Outer().new Inner();
        inner.sendMessage();

    }


}

class Outer {
    String str = "外部类成员变量";

    class Inner {
        String str = "内部类成员变量";

        public void sendMessage() {
            String str = "方法局部变量";
            System.out.println("发送消息");

        }

        public void InOnOut() {
            System.out.println(str);//方法局部变量
            System.out.println(this.str);//内部类成员变量
            System.out.println(new Outer().str);//外部类成员变量
            System.out.println(Outer.this.str);//外部类成员变量
        }
    }
}
