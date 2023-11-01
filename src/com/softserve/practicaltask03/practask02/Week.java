package com.softserve.practicaltask03.practask02;

public class Week {
    private final String dayWeekUA;
    private final String dayWeekEn;
    public static Week MONDAY = new Week("Понеділок", "MONDAY");
    public static Week TUESDAY = new Week("Вівторок", "TUESDAY");
    public static Week WEDNESDAY = new Week("Середа", "WEDNESDAY");
    public static Week THURSDAY = new Week("Четвер", "THURSDAY");
    public static Week FRIDAY = new Week("П'ятниця", "FRIDAY");
    public static Week SATURDAY = new Week("Субота", "SATURDAY");
    public static Week SUNDAY = new Week("Неділя", "SUNDAY");

    public Week(String dayWeekUA, String dayWeekEn) {
        this.dayWeekUA = dayWeekUA;
        this.dayWeekEn = dayWeekEn;
    }

    @Override
    public String toString() {
        return
                "Day of the week in UA = '" + dayWeekUA + '\'' +
                        ", Day of the week in En = '" + dayWeekEn + '\'';
    }
}
