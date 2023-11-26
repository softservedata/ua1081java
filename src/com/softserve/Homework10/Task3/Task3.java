package com.softserve.Homework10.Task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 2));
        students.add(new Student("Bob", 1));
        students.add(new Student("Charlie", 2));
        students.add(new Student("David", 3));
        students.add(new Student("Eva", 1));
        System.out.println(" Original list:");
        Student.printStudents(students, 2);
        students.sort(new Student.byName());
        System.out.println(" Sorted by name list:");
        Student.printStudents(students, 2);
        students.sort(new Student.byCourse());
        System.out.println(" Sorted by course list:");
        Student.printStudents(students, 2);
    }

}
