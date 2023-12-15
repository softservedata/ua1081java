package com.softserve.HomeWorks.HomeWork09Ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentManagement {
    public static void removeUnderperformingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();

            if (student.getAverageGrade() < 3.0) {
                System.out.println(student.getName() + " has been removed due to low average grade.");
                iterator.remove();
            } else {
                // Promote students with an average grade of 3 or higher to the next course level
                student.course++;
                System.out.println(student.getName() + " has been promoted to the next course level.");
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("\nStudents in Course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        // Create a collection of students
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Group A", 1, List.of(4.5, 3.7, 4.0)));
        studentList.add(new Student("Alice", "Group B", 2, List.of(3.2, 3.8, 3.5)));
        studentList.add(new Student("Bob", "Group A", 1, List.of(2.8, 3.1, 2.5)));
        studentList.add(new Student("Eve", "Group C", 3, List.of(4.0, 4.2, 4.5)));

        // Output information before processing
        System.out.println("Students before processing:");
        for (Student student : studentList) {
            System.out.println("Name: " + student.getName() + ", Course: " + student.getCourse() +
                    ", Average Grade: " + student.getAverageGrade());
        }

        // Remove underperforming students and print students in Course 1
        removeUnderperformingStudents(studentList);
        printStudents(studentList, 1);

        // Output information after processing
        System.out.println("\nStudents after processing:");
        for (Student student : studentList) {
            System.out.println("Name: " + student.getName() + ", Course: " + student.getCourse() +
                    ", Average Grade: " + student.getAverageGrade());
        }
    }
}
