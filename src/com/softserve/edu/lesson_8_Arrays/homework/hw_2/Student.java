package com.softserve.edu.lesson_8_Arrays.homework.hw_2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Grades> grades;

    public Student(String name, String group, int course, List<Grades> grades) {
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

    public List<Grades> getGrades() {
        return grades;
    }

    public void setGrades(List<Grades> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student: " +
                "Name='" + name + '\'' +
                ", Group='" + group + '\'' +
                ", Course=" + course +
                ", Grades=" + grades;
    }

    public static void display(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }

    public static void removeStudentsWithAVGLess3(List<Student> list) {
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            List<Grades> gradesList = next.getGrades();
            for (Grades nextG : gradesList) {
                if (nextG.getAVG() >= 3) {
                    next.setCourse(next.getCourse() + 1);
                } else {
                    iterator.remove();
                }
            }
        }
    }

    public static void printStudent(List<Student> list, int course) {
        for (Student student : list) {
            if (student.course == course) {
                System.out.println("The student " + student.getName() + " is studying at " + student.getCourse() + " course");
            }
        }
    }

}



