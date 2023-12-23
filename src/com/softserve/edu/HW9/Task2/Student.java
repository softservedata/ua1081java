package com.softserve.edu.HW9.Task2;

import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Double> grades;


    Student(String name, String group, int course, List<Double> grades){
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void promote(){
        if(calculateGPA() >= 3.0){
            course++;
        }
    }
    public String getName() {
        return name;
    }
    public int getCourse() {
        return course;
    }

    


    
}
