package work;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author 30391
 */
public class CollectionTest {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("efas");
        list.add("皮肤打赏");
        list.add("feas");
        list.add("kughkhgkk");
        list.add("就可以根据对方");
        list.add("皮肤feas打赏");
        list.add("fe撒发顺丰");
        list.add("皮肤打4321赏");
        list.add("134");


//        Iterator<String> iterable = list.iterator();
//        for (String str : list){
//            if (iterable.hasNext()){
//                iterable.next();
//                System.out.println(str);
//            }
//        }
//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String string) {
//                System.out.println(string);
//            }
//        });
//        list.forEach(System.out::println);


        String regex = "[\\u4e00-\\u9fa5]";
//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String string) {
//                if (string.matches(regex)){
//                    System.out.println(string);
//                    list.remove(string);
//
//
//                }
//
//            }
//        });
        //list.removeIf(string -> string.startsWith("皮"));

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().startsWith("皮")) {
                iterator.remove();
            }

        }
        System.out.println(list);

        System.out.println(list);

        list.add("list");
        list.set(6, "listSet");
        System.out.println("list.get(6) = " + list.get(6));
        list.remove("list");
        list.remove(6);
        System.out.println("list = " + list);
        list.addFirst("我来组成头部");
        list.addLast("我来组成尾部");
        System.out.println("list = " + list);


    }


}
