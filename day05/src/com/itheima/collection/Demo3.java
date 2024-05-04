package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    遍历集合，删除集合中 姓“张”同学
    ConcurrentModificationException:并发修改异常
    我们在遍历集合的时候，禁止别人操作集合，如果别人在对集合进行操作，遍历则会报错。
 */
public class Demo3 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("张五");
        list.add("张六");
        list.add("田七");
        /*for (String s : list) {
            if(s.startsWith("张")){
                list.remove(s);
            }
        }*/
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String next = itr.next();
            if (next.equals("张六")) {
                //list.remove(next);
                itr.remove();//不用传递任何参数，当前就是当前元素
            }
        }
        System.out.println(list);
    }
}
