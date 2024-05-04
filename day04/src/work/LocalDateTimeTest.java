package work;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * @author 30391
 */
public class LocalDateTimeTest {

    public static void main(String[] args) {

        LocalDate localDateNow = LocalDate.now();
        System.out.println("localDateNow = " + localDateNow);
        localDateNow.getEra();

        LocalTime localTimeNow = LocalTime.now();
        System.out.println("localTimeNow = " + localTimeNow);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime localDateTimeSet = LocalDateTime.of(1876, 6, 23, 7, 53, 47);
        System.out.println("localDateTimeSet = " + localDateTimeSet);

        LocalTime localTimeSet = LocalTime.of(18, 23, 30);
        System.out.println("localTimeSet = " + localTimeSet);

        LocalDate localDateSet = LocalDate.of(2012, 2, 29);
        System.out.println("localDateSet = " + localDateSet);

        int year = localDateTime.getYear();
        int month = localDateTime.getMonthValue();
        Month month1 = localDateTime.getMonth();
        int dayOfYear = localDateTime.getDayOfYear();
        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();

        System.out.println(year + "" + month + " " + month1 + " " + dayOfYear + " " + hour + " " + minute + " " + second);


        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);

        LocalDateTime dateTimePlus = LocalDateTime.now().plusWeeks(2);
        System.out.println("dateTimePlus = " + dateTimePlus);

        System.out.println("dateTime.isBefore(dateTimePlus) = " + dateTime.isBefore(dateTimePlus));
        System.out.println("dateTimePlus.equals(dateTime) = " + dateTimePlus.equals(dateTime));
        System.out.println("dateTime.isAfter(dateTimePlus) = " + dateTime.isAfter(dateTimePlus));

        System.out.println("localDateTime.toLocalDate() = " + localDateTime.toLocalDate());
        System.out.println("localDateTime.toLocalTime() = " + localDateTime.toLocalTime());


//        LocalDate localDateSetOf = LocalDate.
//        System.out.println("localDateSetOf = " + localDateSetOf);

    }
}
