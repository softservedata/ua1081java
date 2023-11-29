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

    public double getAVG() {//better to use List<Integer> grades and name method getAverage()
        return (double) (mathGrade + historyGrade + languageGrade + lawGrade) / 4;//better to use grades.size() instead of 4,
        //because if you add new subject you will not need to change this method
        //also you can use stream API
        //but, it's possible only for List<Integer> grades
    }
}
