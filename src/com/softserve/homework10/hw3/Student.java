package com.softserve.homework10.hw3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {

    public static class CompareByName implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            {
                return student1.getFullName().compareTo(student2.getFullName());
            }
        }
    }

    public static class CompareByCourse implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            if(student1.getCourse() < student2.getCourse())
                return -1;
            else if(student1.getCourse() > student2.getCourse())
                return 1;
            return 0;
        }
    }

    private String fullName;
    private int course;

    public Student(String fullName, int course) {
        this.fullName = fullName;
        this.course = course;
    }

    public String getFullName() {
        return fullName;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Full Name: " + fullName + " | Course: " + course;
    }

    public static void printStudents(List<Student> studentsList, int course) {
        System.out.println("Students enrolled in the course " + course + ":");
        Iterator<Student> iterator = studentsList.iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                counter += 1;
                System.out.println("\tStudent #" + counter + ": " + student.getFullName());
            }
        }
        if (counter == 0) {
            System.out.println("\tNone");
        }
    }
}
