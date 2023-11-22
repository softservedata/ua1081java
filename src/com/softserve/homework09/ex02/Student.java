package com.softserve.homework09.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private int course;
    private double gradeMath;
    private double gradePhysics;
    private double gradeLanguage;

    public Student(String name, String group, int course, double gradeMath, double gradePhysics, double gradeLanguage) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.gradeMath = gradeMath;
        this.gradePhysics = gradePhysics;
        this.gradeLanguage = gradeLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getGradeMath() {
        return gradeMath;
    }

    public void setGradeMath(double gradeMath) {
        this.gradeMath = gradeMath;
    }

    public double getGradePhysics() {
        return gradePhysics;
    }

    public void setGradePhysics(double gradePhysics) {
        this.gradePhysics = gradePhysics;
    }

    public double getGradeLanguage() {
        return gradeLanguage;
    }

    public void setGradeLanguage(double gradeLanguage) {
        this.gradeLanguage = gradeLanguage;
    }

    public List<Double> getAllGrades() {
        return new ArrayList<>(Arrays.asList(gradeMath, gradePhysics, gradeLanguage));
    }

    public double getAverageGrade() {
        return (gradeMath + gradePhysics + gradeLanguage) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + getAllGrades() +
                ", average grade=" + String.format("%.2f",getAverageGrade()) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getCourse() == student.getCourse() && Double.compare(getGradeMath(), student.getGradeMath()) == 0 && Double.compare(getGradePhysics(), student.getGradePhysics()) == 0 && Double.compare(getGradeLanguage(), student.getGradeLanguage()) == 0 && Objects.equals(getName(), student.getName()) && Objects.equals(getGroup(), student.getGroup());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGroup(), getCourse(), getGradeMath(), getGradePhysics(), getGradeLanguage());
    }
}
