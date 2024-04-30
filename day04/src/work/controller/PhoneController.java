package work.controller;

import java.util.ArrayList;

public class PhoneController {


    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("15611111111");
        arrayList.add("18888888888");
        arrayList.add("156JQKA1234");
        arrayList.add("你好");
        arrayList.add("哈哈");


        ArrayList<String> list = finRegex(arrayList);
        System.out.println("list = " + list);

    }


    public static ArrayList<String> finRegex(ArrayList<String> arrayList) {

        String regexPhoneNumber = "1[3-9]{2}\\d{8}";
        String regexContent = "[\\u4E00-\\u9FFF]";

        for (int i = 0; i < arrayList.size(); i++) {
            if (!arrayList.get(i).matches(regexPhoneNumber) && !arrayList.get(i).matches(regexContent)) {
                arrayList.remove(i);
                i++;
            }
        }
        return arrayList;

    }
}
