package com.softserve.homework10.ex03;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(new Student ("Alex", 5),
                new Student("Stanley", 4), new Student("Nastya", 3),
                new Student("Oleksiy", 2), new Student("Anna", 3)));

        System.out.println("Please, input a number of the course:");
        int input = sc.nextInt();
        Student.printStudents(students, input);
        System.out.println();
        System.out.printf("List, sorted by course:%s%n%n", Student.sortByCourseAscending(students));
        System.out.printf("List, sorted by name:%s%n%n", Student.sortByNameDescending(students));
        Collections.sort(students);
        System.out.printf("List, sorted by course and then by name: %s%n", students);
    }

}
