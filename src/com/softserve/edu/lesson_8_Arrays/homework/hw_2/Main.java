package com.softserve.edu.lesson_8_Arrays.homework.hw_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        List<Grades> firstStudent = new LinkedList<>();
        firstStudent.add(new Grades(4, 3, 4, 5));
        students.add(new Student("Roman", "Group A", 2, firstStudent));

        List<Grades> secondStudent = new LinkedList<>();
        secondStudent.add(new Grades(1, 1, 1, 2));
        students.add(new Student("Ira", "Group A", 1, secondStudent));

        List<Grades> thirdStudent = new LinkedList<>();
        thirdStudent.add(new Grades(4, 5, 2, 5));
        students.add(new Student("Igor", "Group B", 4, thirdStudent));

        List<Grades> fourthStudent = new LinkedList<>();
        fourthStudent.add(new Grades(5, 5, 4, 3));
        students.add(new Student("Igor", "Group B", 4, fourthStudent));

        Student.removeStudentsWithAVGLess3(students);
        Student.printStudent(students, 4);
        Student.display(students);

    }
}
