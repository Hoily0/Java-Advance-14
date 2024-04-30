package work;

public class IntegerTest {
    public static void main(String[] args) {

        Integer iNum1 = new Integer(20);
        Integer iNum2 = Integer.valueOf(20);
        Integer iNum3 = Integer.valueOf("20");
        Integer iNum4 = 20;//推荐使用


        for (int i = 1; i < 5; i++) {
            String str = "iNum";
            String strResult = str + i;
            Integer result = Integer.valueOf(strResult);
            System.out.println(result);
        }


    }
}
