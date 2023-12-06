package Homework13;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class BirthdayDate {

    private static String formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return date.format(formatter);
    }

    private static void printDay(LocalDate birthday) {
        System.out.println("Birthday day is a: " + formatDate(birthday) + " (day of week: " + birthday.getDayOfWeek() + ")");

        LocalDate date1 = birthday.plusMonths(6);
        System.out.println("Day of the week after 6 month from " + formatDate(birthday) + " it's " + date1.getDayOfWeek());
//        Period period1 = Period.of(0,6,0);
//        System.out.println("Day of the week after 6 month from " + formatDate(birthday) + " it's " + birthday.plus(period1).getDayOfWeek());

        LocalDate date2 = birthday.plusYears(1);
        System.out.println("Day of the week after one year from " + formatDate(birthday) + " it's " + date2.getDayOfWeek());
//        Period period2 = Period.of(1,0,0);
//        System.out.println("Day of the week after 6 month from " + formatDate(birthday) + " it's " + birthday.plus(period2).getDayOfWeek());
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1992, 8, 9);
        printDay(birthday);
    }
}
