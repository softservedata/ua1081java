package com.softserve.Homework09.Task2;

import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrades() {
        double result = 0;
        for (Integer element : grades) {
            result += element;
        }
        return result / grades.size();
    }

    public void promoteToNextCourseLevel() {
        course += 1;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "\tStudent " + name + "  course: " + course;
    }
}
