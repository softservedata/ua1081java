package com.softserve.Homework09.Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Patric", "KN", 2, List.of(3, 5, 4, 3, 4, 4)));
        studentList.add(new Student("Kevin", "KN", 1, List.of(5, 2, 4, 5, 2, 5)));
        studentList.add(new Student("Olha", "KN", 3, List.of(1, 5, 5, 5, 1, 1)));
        studentList.add(new Student("Katya", "KN", 1, List.of(4, 5, 4, 3, 4, 3)));
        System.out.println(" Initial list of students (2 course): ");
        printStudents(studentList, 2);
        session(studentList);
        System.out.println(" List of students (2 course) after session: ");
        printStudents(studentList, 2);
    }

    public static void printStudents(List<Student> studentList, int course) {
        for (Student student : studentList) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    public static void session(List<Student> studentList) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrades() >= 3) {
                student.promoteToNextCourseLevel();
            } else {
                iterator.remove();
            }
        }
    }
}
