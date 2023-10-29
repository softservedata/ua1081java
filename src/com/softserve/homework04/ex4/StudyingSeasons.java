package com.softserve.homework04.ex4;

public enum StudyingSeasons {
    AUTUMN("autumn", "first semester, studying"),
    WINTER("winter", "winter session, passing exams"),
    SPRING("spring", "second semester, studying"),
    SUMMER("summer", "holiday time");

    private final String season;
    private final String activity;

    public String getSeason() {
        return season;
    }

    public String getActivity() {
        return activity;
    }

    StudyingSeasons(String season, String activity) {
        this.season = season;
        this.activity = activity;
    }
}
