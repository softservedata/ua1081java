package com.softserve.homework08;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("Jane", "Smith"), 19, 4);
        Student student2 = new Student(new FullName("Jack", "Jones"), 20, 2);
        System.out.println(student1.info());
        System.out.println(student2.info());

        Student student3 = (Student) student1.clone();
        student3.setCourse(3);

        System.out.println(student1.info());
        System.out.println(student2.info());
        System.out.println(student3.info());
    }
}
