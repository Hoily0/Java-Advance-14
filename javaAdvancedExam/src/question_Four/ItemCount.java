package question_Four;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author 30391
 */
public class ItemCount {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String next = scanner.nextLine();
            if ("end".equals(next)) {
                break;
            }
            if (map.containsKey(next)) {
                map.put(next, map.get(next) + 1);
            } else {
                map.put(next, 1);
            }
        }
        System.out.println(map);
        map.forEach((k, v) -> System.out.println(k + " 售出数量 " + v));
    }

}
