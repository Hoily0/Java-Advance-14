package work.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author 30391
 */
public class toMapTest {
    public static void main(String[] args) {

        String[] sArr = {"张三,北京", "李四,上海", "王五,深圳", "赵六,广州", "周七,黑龙江"};

        Map<String, String> collect = Arrays.stream(sArr).collect(Collectors.toMap(new Function<String, String>() {

            @Override
            public String apply(String s) {
                return s.split(",")[0];
            }
        }, new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split(",")[1];
            }
        }));

        collect.forEach((s1, s2) -> System.out.println("姓名为：" + s1 + "---居住地为：" + s2));


    }


}
