package com.softserve.homework09.ex02;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.List;

public class StudentAssessment {
    static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    static void printStudents(List<Student> students) {
        System.out.println("The whole group is:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    static void removeStudents(List<Student> students, double avgToPass) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student nextStudent = iterator.next();
            if (nextStudent.getAverageGrade() < avgToPass) {
                System.out.printf("Student is removed because of average below %s: %s%n", avgToPass, nextStudent);
                iterator.remove();
            }
        }
    }
}
