package homework13.h2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Time {

    public static void main(String[] args) {
        String myDate = "07.08.1990";
        System.out.println(validateDate(myDate));

        LocalDate birthday = LocalDate.of(1990, 8, 7);
        System.out.println(birthday.isLeapYear());

        System.out.println(leapYear(birthday));

        printDay(birthday);

    }

    public static String validateDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM:dd:yyyy");
        return String.format(date, formatter);

    }

    public static boolean leapYear(LocalDate date) {
        return date.isLeapYear();
    }

    public static void printDay(LocalDate date) {
        System.out.println(date.getDayOfWeek());
        Period period = Period.ofMonths(6);
        LocalDate plusSix = date.plus(period);
        System.out.println(plusSix.getDayOfWeek());
        Period period1 = Period.ofMonths(12);
        LocalDate plusTwelve = date.plus(period1);
        System.out.println(plusTwelve.getDayOfWeek());
    }
}