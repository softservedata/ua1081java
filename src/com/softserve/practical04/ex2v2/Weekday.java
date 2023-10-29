package com.softserve.practical04.ex2v2;

public enum Weekday {
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday", "П'ятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя"),
    INVALID_DAY("Please, input a number 1-7", "Будь ласка, введіть число з 1 по 7");


    private final String en;
    private final String ua;


    Weekday(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }

    public String getEn() {
        return en;
    }

    public String getUa() {
        return ua;
    }
}
