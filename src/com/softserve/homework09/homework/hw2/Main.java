package com.softserve.homework09.homework.hw2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Nataliia Kondratenko", "AG734", 3, new ArrayList<Integer>(List.of(3, 4, 5))));
        students.add(new Student("Andriy Starosta", "GT645", 1));
        students.add(new Student("Petro Korosta", "UR936", 3, new ArrayList<Integer>(List.of(2, 2, 3))));
        students.add(new Student("Hanna Vesna", "YE123", 1, new ArrayList<Integer>(List.of(2, 0, 3))));
        students.add(new Student("Solomiya Sopilka", "KE012", 5, new ArrayList<Integer>(List.of(5, 5, 4))));
        students.add(new Student("Inna Stopa", "HH625", 5, new ArrayList<Integer>(List.of(2, 2, 4, 0))));
        students.add(new Student("Stanislav Ruka", "LE662", 5, new ArrayList<Integer>(List.of(5, 2, 5, 4))));

        System.out.println("Original List of Students: " + students);

        StudentsManagement.manageStudents(students);

        System.out.println("List of Students after correction: " + students);

        StudentsManagement.printStudents(students, 6);
    }
}
