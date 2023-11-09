package com.softserve.homework04.homework.faculty;

public enum Season {
    WINTER("Winter", "Winter exams") {
        public Season nextSeason() {
            return SPRING;
        }
    },
    SPRING("Spring", "Second semester") {
        public Season nextSeason() {
            return SUMMER;
        }
    },
    SUMMER("Summer", "Vacation period") {
        public Season nextSeason() {
            return AUTUMN;
        }
    },
    AUTUMN("Autumn", "First semester") {
        public Season nextSeason() {
            return WINTER;
        }
    };

    public abstract Season nextSeason();
    private final String seasonName;
    private final String semesterName;

    Season(String seasonName, String semesterName) {
        this.seasonName = seasonName;
        this.semesterName = semesterName;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSemesterName() {
        return semesterName;
    }
}