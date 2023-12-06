package PracticalTasks13;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ShowDayOfWeek {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}
