package com.softserve.homework04.homework.faculty;

public class Faculty {
    private int studentsNumber;
    private Season currentSeason;

    public int getStudentsNumber() {
        return studentsNumber;
    }

    public void setStudentsNumber(int studentsNumber) {
        this.studentsNumber = studentsNumber;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }

    public Faculty() {
    }

    public Faculty(int studentsNumber, Season currentSeason) {
        this.studentsNumber = studentsNumber;
        this.currentSeason = currentSeason;
    }
}
