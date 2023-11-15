package com.softserve.edu.lesson_8_Arrays.homework.hw_2;

import java.util.List;

public class Grades {

    private int mathGrade;

    private int languageGrade;
    private int historyGrade;
    private int lawGrade;

    public Grades(int mathGrade, int languageGrade, int historyGrade, int lawGrade) {
        this.mathGrade = mathGrade;
        this.languageGrade = languageGrade;
        this.historyGrade = historyGrade;
        this.lawGrade = lawGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getLanguageGrade() {
        return languageGrade;
    }

    public void setLanguageGrade(int languageGrade) {
        this.languageGrade = languageGrade;
    }

    public int getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(int historyGrade) {
        this.historyGrade = historyGrade;
    }

    public int getLawGrade() {
        return lawGrade;
    }

    public void setLawGrade(int lawGrade) {
        this.lawGrade = lawGrade;
    }

    @Override
    public String toString() {
        return
                "Math grade =" + mathGrade +
                        ", Language grade=" + languageGrade +
                        ", History grade=" + historyGrade +
                        ", Law grade=" + lawGrade;
    }

    public double getAVG() {
        double avg = (double) (mathGrade + historyGrade + languageGrade + lawGrade) / 4;
        return avg;
    }
}
