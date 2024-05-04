package com.itheima.object;

public class ObjectDemo2 {
    /*
        Object类的equals方法 :

            public boolean equals(Object obj) : 指示其他某个对象是否与此对象“相等”。

            Object类的equals方法默认逻辑 : 还是做地址值的比较

                    public boolean equals(Object obj) {
                        return (this == obj);
                    }

                    重点记忆: 重写equals方法, 让对象不再比较地址, 而是比较对象内容信息.
     */
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("张三", 23);
        Student stu3 = new Student("张三", 24);

        System.out.println(stu1.equals(stu2));
        System.out.println(stu1.equals(stu3));
    }
}
