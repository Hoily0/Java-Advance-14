package work;

import java.util.HashMap;
import java.util.Random;

/**
 * @author 30391
 */
public class PrisonerRecursion {
    public static void main(String[] args) {

        HashMap<Integer, Integer> prisoner = new HashMap();
        Random random = new Random();
        int index = 1;
        while (prisoner.size() < 100) {
            int r = random.nextInt(200) + 1;
            if (prisoner.containsValue(r)) {
                continue;
            }
            prisoner.put(index, r);
        }

        System.out.println("原始囚犯的编号" + prisoner);
        int finalValue = removePrisoner(prisoner);
        System.out.println("幸存者的编号" + finalValue);


    }

    private static int removePrisoner(HashMap<Integer, Integer> prisoner) {
        for (int i = 0; i < prisoner.size(); i += 2) {
            prisoner.remove(i);
            prisoner.put(i / 2, prisoner.get(i));
        }
        if (prisoner.size() == 1) {
            return prisoner.get(1);
        }
        return removePrisoner(prisoner);
    }


}
