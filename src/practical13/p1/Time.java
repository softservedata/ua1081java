package practical13.p1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Time{


    public static void main(String[] args) {

        LocalDate currentDay = LocalDate.now();

        System.out.println(currentDay.getDayOfWeek());

        TemporalAdjuster firstMonday = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println(currentDay.with(firstMonday));

    }

}