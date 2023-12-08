package Homework_09_Ivan;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int courseNumber = 1;
        ArrayList <Student> students = new ArrayList<>();
        Student student1 = new Student("Bob", 1);
        students.add(student1);

        Student student2 = new Student("Lilly", 1);
        students.add(student2);

        Student student3 = new Student("Adam", 2);
        students.add(student3);

        Student student4 = new Student("Bob", 3);
        students.add(student4);

        Student student5 = new Student("Alice", 2);
        students.add(student5);


        student1.printStudents(students, courseNumber);


//        students.sort(new StudentNameComparator());
        students.sort(new StudentCourseComparator());

        System.out.println(students);


        System.out.println(student1.equals(student4));

    }
}


