package work.mayNine;

import javax.print.DocFlavor;
import java.awt.event.MouseAdapter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 30391
 */
public class TraverseCharacters {
    public static void main(String[] args) throws IOException {


        FileInputStream inputStream = new FileInputStream("C:\\Users\\30391\\IdeaProjects\\" +
                "projectAdvance\\day08\\File\\test.txt");

        int len;
        StringBuilder string = new StringBuilder();
        while ((len = inputStream.read()) != -1) {
            string.append((char) len);
        }


        int count = 1;

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char atr = string.charAt(i);
            if (!(characterIntegerMap.containsKey(atr))) {
                characterIntegerMap.put(atr, count);
            } else {
                characterIntegerMap.put(atr, count++);
            }
        }

        characterIntegerMap.forEach((k, v) -> System.out.println("字母" + k + "出现了" + v + "次"));
    }
}
