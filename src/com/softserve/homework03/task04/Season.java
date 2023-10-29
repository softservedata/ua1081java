package com.softserve.homework03.task04;

public class Season {
    private final String currentSeason;
    private final String task;
    public static Season WINTER = new Season("WINTER", "exams");
    public static Season SPRING = new Season("SPRING", "second semester");
    public static Season SUMMER = new Season("SUMMER", "vacation period");
    public static Season AUTUMN = new Season("AUTUMN", "first semester");

    public Season(String currentSeason, String task) {
        this.currentSeason = currentSeason;
        this.task = task;
    }

    public String getCurrentSeason() {
        return currentSeason;
    }

    public String getTask() {
        return task;
    }
}
