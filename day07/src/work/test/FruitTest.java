package work.test;

import java.util.*;


/**
 * - 有四种水果String类型表示(苹果，香蕉，西瓜，橘子)
 * 1. 给每种水果设定一个商品号Integer类型表示，商品号是8个0-9的随机数，商品号码不能重复。
 * 2. 根据商品号查询对应的商品。Map<Integer,String>
 * 如果查不到输出：“查无此商品”
 * 如果能查到打印：”根据商品号：12345678，查询到对应的商品为：西瓜”
 *
 * @author 30391
 */
public class FruitTest {
    public static void main(String[] args) {

        traverse();
    }

    private static void traverse() {

        Map<Integer, String> map = new HashMap<>();

        Integer ref = getOnlyIndex();//todo 查值
        System.out.println(ref);
        map.put(ref, "苹果");

        map.put(getOnlyIndex(), "香蕉");
        map.put(getOnlyIndex(), "西瓜");
        map.put(getOnlyIndex(), "橘子");
        System.out.println(map);


        while (true) {
            System.out.println("输入-1退出");
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
            if (map.containsKey(index)) {
                System.out.println("查询到商品");
                System.out.println("索引为" + index + "的商品是" + map.get(index));
            } else if (index == -1) {
                break;
            } else {
                System.out.println("未找到商品");
                System.out.println("重新输入");
            }
        }


    }

    private static Integer getOnlyIndex() {

        Set<Integer> set = new HashSet<>();
        while (set.isEmpty()) {
            set.add(getRandom());
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        return list.get(0);
    }


    public static Integer getRandom() {

        Random random = new Random();
        StringBuilder id = new StringBuilder();

        while (id.length() < 8) {
            if (id.length() == 0) {
                id.append(random.nextInt(9) + 1);
            }
            id.append(random.nextInt(10));
        }
        return Integer.valueOf(id.toString());
    }
}
