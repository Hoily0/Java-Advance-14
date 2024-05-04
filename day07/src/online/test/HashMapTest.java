package online.test;

import java.util.*;

/**
 * @author 30391
 */
public class HashMapTest {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("姓名", 31421);
        map.put("性别", 134);
        map.put("位置", 134);
        map.put("体重", 74);
        map.put("身高", 184);
        map.put("电话", 145243124);
        System.out.println("map = " + map);

//
//        System.out.println("map = " + map);
//
//        System.out.println("map.get(\"性别\") = " + map.get("性别"));
//
//        System.out.println("map.remove(\"体重\", 184) = " + map.remove("体重", 184));
//
//        System.out.println("map.size() = " + map.size());
//
//        System.out.println("map.keySet() = " + map.keySet());
//
//        System.out.println("map.containsValue(134) = " + map.containsValue(134));
//
//        System.out.println("map.values() = " + map.values());
//
//        map.clear();
//        System.out.println("map = " + map);
//
//        System.out.println("map.isEmpty() = " + map.isEmpty());


        HashMap<String, Integer> letterMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);


        String[] str = scanner.next().split("");

        for (String s : str) {
            if (letterMap.containsKey(s)) {
                Integer integer = letterMap.get(s);
                integer++;
                letterMap.put(s, integer);
            } else {
                letterMap.put(s, 1);
            }
        }
        System.out.println("letterMap = " + letterMap);

//     Set<String> keys = map.keySet();
//        for (String k : keys){
//            System.out.println("k = " + k);
//            System.out.println("set.get(k) = " + map.get(k));
//
//        }

//        Set<Map.Entry<String, Integer>> set = map.entrySet();
//        for (Map.Entry<String, Integer> entry : set){
//            String keyEntry = entry.getKey();
//            Integer valueEntry = entry.getValue();
//            System.out.println("keyEntry = " + keyEntry);
//            System.out.println("valueEntry = " + valueEntry);
//            System.out.println("entry = " + entry);
//
//
//        }
//        map.forEach((k,v)-> System.out.printf("%s %d%n", k, v));


    }
}
