package work;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 30391
 */
public class TryCatchTest {

    public static void main(String[] args) {
        try {
            ArrayList<String> strings = getStrings();
            getNames(strings);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("异常");
        }


    }

    private static void getNames(ArrayList<String> strings) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("姓名");
        String name = scanner.next();
        System.out.println("年龄");
        int age = 0;

        age = scanner.nextInt();

        scanner.next();


        System.out.println("生日");
        String birthday = scanner.next();

        System.out.println(name + " " + age + " " + birthday);


        strings.add("43124");
        System.out.println("strings.get(0) = " + strings.get(0));
    }

    private static ArrayList<String> getStrings() {
        ArrayList<String> strings = new ArrayList<>();


        System.out.println("strings.get(7).getBytes() = " + strings.get(7).getBytes());

        System.out.println("索引异常");

        return strings;
    }
}
