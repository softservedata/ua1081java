package com.softserve.edu.lesson_9_MapSet.homework.hw_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Igor", 4));
        students.add(new Student("Ira", 3));
        students.add(new Student("Ruslana", 2));
        students.add(new Student("Andriy", 1));
        students.add(new Student("Olga", 4));
        students.add(new Student("Nazar", 2));
        students.add(new Student("Viktor", 1));
        students.add(new Student("Olga", 2));

        Student.printStudents(students, 2);
        students.sort(new Student.ByNameAndCourse());
        System.out.println();
        Student.display(students);
    }
}
