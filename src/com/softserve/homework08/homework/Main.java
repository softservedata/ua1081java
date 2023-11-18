package com.softserve.homework08.homework;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student firstStudent = new Student(new FullName("Nataliia", "Kondratenko"), 36, 1);
        Student secondStudent = new Student(new FullName("Andriy", "Mirniy"), 22, 6);

        System.out.println(firstStudent.info());
        System.out.println(firstStudent.activity());
        System.out.println(secondStudent.info());
        System.out.println(secondStudent.activity());
        System.out.println();

        Student firstStudentClone = (Student) firstStudent.clone();
        firstStudentClone.setCourseNumber(3);

        System.out.println(firstStudent.info());
        System.out.println(firstStudent.activity());
        System.out.println(secondStudent.info());
        System.out.println(secondStudent.activity());
        System.out.println(firstStudentClone.info());
        System.out.println(firstStudentClone.activity());
    }
}
