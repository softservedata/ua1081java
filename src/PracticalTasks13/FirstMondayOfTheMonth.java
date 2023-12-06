package PracticalTasks13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class FirstMondayOfTheMonth {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, Month.DECEMBER, 04);
        TemporalAdjuster firstMonInMonth =
                TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println("Date of first Monday in this month: " + localDate.with(firstMonInMonth));
    }

}
