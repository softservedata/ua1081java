package com.softserve.edu.HW9.Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void removeAndPromoteStudents(List<Student> students){
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.calculateGPA() < 3.0) {
                iterator.remove(); 
            } else {
                student.promote(); 
            }
        }

    }

    public static void printStudents(List<Student> students, int course){
        System.out.println("Students in course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }

    }

    public static void main(String[] args) {
        List<Student> studentCollection = new ArrayList<>();
        studentCollection.add(new Student("Max", "GroupA", 1, List.of(3.5, 4.0, 3.7)));
        studentCollection.add(new Student("Olia", "GroupB", 2, List.of(2.8, 3.2, 2.5)));
        studentCollection.add(new Student("Vincent", "GroupA", 1, List.of(2.0, 2.5, 1.8)));
        studentCollection.add(new Student("Alice", "GroupC", 3, List.of(3.9, 3.7, 10.0)));
        
        System.out.println("Old student list:");
        for (Student student : studentCollection) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }

        removeAndPromoteStudents(studentCollection);

        System.out.println("New student list:");
        for (Student student : studentCollection) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }

        printStudents(studentCollection, 2);


    }
    
}
