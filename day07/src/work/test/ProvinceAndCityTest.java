package work.test;

import java.util.*;

/**
 * @author 30391
 */

//- 需求
//定义一个Map集合，键用表示省份名称，值表示市，但是市会有多个。
//添加完毕后，遍历结果：
//打印格式如下：
//江苏省 = 南京市，扬州市，苏州市，无锡市，常州市
//湖北省 = 武汉市，孝感市，十堰市，宜昌市，鄂州市
//河北省 = 石家庄市，唐山市，邢台市，保定市，张家口市
//提示：
//创建一个Map集合
//键：类型为String，存省份名字。
//值：类型为ArrayList，存多个市的名字。
public class ProvinceAndCityTest {
    public static void main(String[] args) {

        Map<String, ArrayList<String>> listMap = new HashMap<>();

        ArrayList<String> provinceJiangsuList = new ArrayList<>();
        Collections.addAll(provinceJiangsuList, "南京", "扬州", "苏州", "无锡", "常州");

        ArrayList<String> provinceHubeiList = new ArrayList<>();
        Collections.addAll(provinceHubeiList, "武汉", "孝感", "十堰", "宜昌", "鄂州");

        ArrayList<String> provinceHebeiList = new ArrayList<>();
        Collections.addAll(provinceHebeiList, "石家庄", "唐山", "邢台", "保定", "张家口市");

        listMap.put("江苏省", provinceJiangsuList);
        listMap.put("湖北省", provinceHubeiList);
        listMap.put("河北省", provinceHebeiList);

        System.out.println("listMap = " + listMap);

        listMap.forEach((k, v) -> System.out.println(k + " " + v));


    }
}
