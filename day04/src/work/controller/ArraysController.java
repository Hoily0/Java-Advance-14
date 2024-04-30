package work.controller;

import work.entity.Students;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraysController {

    public static void main(String[] args) {
        ArrayList<Students> arrayList = new ArrayList<>();

        Students students1 = new Students("张三", 23, "1561111111");
        Students students2 = new Students("李四", 24, "15622222222");
        Students students3 = new Students("王五", 25, "1563333JQKA");
        Students students4 = new Students("赵六", 26, "233");

        arrayList.add(students1);
        arrayList.add(students2);
        arrayList.add(students3);
        arrayList.add(students4);

        regularVerification(arrayList);

        // 输出经过验证后的列表
        System.out.println("经过验证后的arrayList = " + arrayList);
    }

    public static void regularVerification(ArrayList<Students> arrayList) {
        // 手机号正则表达式
        String regex = "1[3-9]\\d{9}";

        // 使用迭代器遍历列表，安全地删除不符合条件的学生对象
        Iterator<Students> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Students student = iterator.next();
            if (!student.getPhoneNumber().matches(regex)) {
                iterator.remove(); // 使用迭代器的 remove 方法删除当前元素
            } else {
                String prefix = student.getPhoneNumber().substring(0, 3);
                String suffix = student.getPhoneNumber().substring(7, 11);

                String str = prefix + "****" + suffix;
                student.setPhoneNumber(str);

            }
        }
    }
}
