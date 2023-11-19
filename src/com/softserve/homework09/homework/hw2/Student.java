package com.softserve.homework09.homework.hw2;

import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
    }

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    //The rest of the getters and setters (which are not used in a specific task)
    // have been omitted in order to reduce the amount of code to be checked

    @Override
    public String toString() {
        return "Student Info: " +
                "\n\tName: " + name +
                "\n\tGroup: " + group +
                "\n\tCourse: " + course +
                "\n\tAll grades: " + (grades != null ? grades : "No grades yet") +
                "\n\tAverage grade: " + getAverageGrade() + "\n";
    }

    public int getAverageGrade() {
        if (grades == null || grades.isEmpty()) {
            return 0;
        }
        int averageGrade = 0;
        for (Integer grade : grades) {
            averageGrade += grade;
        }
        return averageGrade / grades.size();
    }
}