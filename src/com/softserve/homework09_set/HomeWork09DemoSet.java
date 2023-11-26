package com.softserve.homework09_set;

import com.softserve.homework09_set.task01.AppUtilitySet;
import com.softserve.homework09_set.task03.Student;

import java.util.*;

public class HomeWork09DemoSet {
    public static void main(String[] args) {
//        Task 01 Develop parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set
//        set2), realizing the operations of union and intersection of two sets. Test the operation
//        of these techniques on two pre-filled sets.

        int num = 10;
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < num; i++) {
            double random = Math.random() * 20;
            set1.add((int) random);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < num; i++) {
            double random = Math.random() * 20;
            set2.add((int) random);
        }

        System.out.println(set1);
        System.out.println(set2);

        System.out.println(AppUtilitySet.methodUnionTwoSet(set1, set2));
        System.out.println(AppUtilitySet.intersectedOfTwoSets(set1, set2));


//        Task 03 Create a class named Student that stores information about the student's name and course.
//          • The class should include properties to access these fields, a constructor with
//  parameters, and a method called printStudents that takes a List of students and an
//  Integer representing the course number as arguments.
//          • This method should print the names of the students from the list who are enrolled in
//  the specified course to the console using an iterator.
//          • Additionally, add methods to compare students by name and by course.
//          • In the main() method, create a List named "students" and add five different Student
//  objects to it. Then, display the list of students sorted by name and sorted by course.

        System.out.println("***********Task 03************");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kate", 2));
        students.add(new Student("Petro", 2));
        students.add(new Student("Ostap", 1));
        students.add(new Student("Marichka", 3));
        students.add(new Student("Dmytro", 2));
        students.add(new Student("Andrii", 5));
        students.add(new Student("Roman", 1));
        students.add(new Student("Pavlo", 3));
        students.add(new Student("Iryna", 5));
        students.add(new Student("Mykola", 3));

        Student.printStudents(students, 3);

        System.out.println();
        Collections.sort(students, new Student.CompareByName());
        System.out.println("Sort by name: \n" + students);
        System.out.println();
        Collections.sort(students, new Student.CompareByCourse());
        System.out.println("Sort by course: \n" + students);
    }

}
