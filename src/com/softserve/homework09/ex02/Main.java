package com.softserve.homework09.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", "Economics", 2, 3, 5, 4));
        students.add(new Student("Jane", "Banking", 4, 3.6, 4.7, 5));
        students.add(new Student("Alex", "Physics", 1, 2, 2.5, 2.8));
        students.add(new Student("Ben", "Physics", 4, 3, 2.7, 2.9));

        StudentAssessment.printStudents(students);
        System.out.println("Please, input number of a course to display: ");
        int input = sc.nextInt();

        System.out.printf("Students studying at the course №%d:%n", input);
        StudentAssessment.printStudents(students, input);
        System.out.println();
        System.out.println("Removal of students because of the average below 3.0:");
        StudentAssessment.removeStudents(students, 3);
        System.out.println();
        StudentAssessment.printStudents(students);

    }
}
