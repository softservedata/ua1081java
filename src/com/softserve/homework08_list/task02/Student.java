package com.softserve.homework08_list.task02;

import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Double> grades;

    public Student(String name, String group, int course, List<Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
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

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }

    public static double averageGrades(List<Double> grades) {
        double grade = 0;
        for (Double d : grades) {
            grade += d;
        }
        double averageGrade = grade / grades.size();
        return averageGrade;
    }

    public static void removeStudentsWithGradeLesThree(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (averageGrades(student.getGrades()) < 3) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println("Student of " + course + " course is " + student.getName());
            }
        }
    }

}
