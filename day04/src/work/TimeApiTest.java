package work;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * @author 30391
 */
public class TimeApiTest {
    public static void main(String[] args) throws Exception {

        String date = "1971年11月49日 19小时37分钟22秒";
//        yyyy年MM月dd日 HH小时mm分钟ss秒
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH小时mm分钟ss秒");

        Date parse = simpleDateFormat.parse(date);


        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String format = simpleDateFormat2.format(parse);
        System.out.println(format);


//        getBirthday();

//         date.getTime()


//        extracted();

//        simpleTime();

    }

//    private static void getBirthday() throws ParseException {
//        Scanner sc = new Scanner(System.in);
//        String next = sc.next();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
//        Date parse = simpleDateFormat.parse(next);
////        System.out.println(parse);
//        Date date = new Date();
//        long l = (long) ((date.getTime() - parse.getTime()) * 1.0 / (60 * 60 * 24 * 1000));
//        System.out.println(l);
//    }

//    private static void simpleTime() throws ParseException {
//        SimpleDateFormat format = new SimpleDateFormat();
//        System.out.println("format = " + format);
//
//        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
//        System.out.println(format1);
//
//        Date date = new Date();
//        Date date2 = new Date(0);
//        String d1 = format1.format(date);
//        String d2 = format1.format(date2);
//        System.out.println("d1 = " + d1);
//        System.out.println("d2 = " + d2);
//
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd//HH:mm:ss");
//        String s = "2019/12/23//12:30:59";
//        Date parse = simpleDateFormat.parse(s);
//        System.out.println(parse);
//    }

//    private static void extracted() {
//        Date date = new Date();
//        System.out.println(date);
//
//
//        long time = date.getTime();
//        System.out.println("time = " + time);
//        date.setTime(0);
//        System.out.println("重设时间 = " + date.getTime());
//        System.out.println("重设时间 = " + date);
//        Date date1 = new Date(0);
//        System.out.println("date1 = " + date1);
//    }
}
