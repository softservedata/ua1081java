package com.softserve.homework10.hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nataliia Kondratenko", 3));
        students.add(new Student("Andriy Starosta", 1));
        students.add(new Student("Petro Korosta", 3));
        students.add(new Student("Hanna Vesna", 1));
        students.add(new Student("Solomiya Sopilka", 5));
        students.add(new Student("Inna Stopa", 5));
        students.add(new Student("Stanislav Ruka", 5));

        Student.printStudents(students, 5); //3 students
        Student.printStudents(students, 7); //None

        Collections.sort(students, new Student.CompareByName());

        System.out.println("Students sorted by name:");
        for (Student student : students) {
            System.out.println("\t" + student);
        }

        Collections.sort(students, new Student.CompareByCourse());

        System.out.println("Students sorted by course:");
        for (Student student : students) {
            System.out.println("\t" + student);
        }
    }
}
