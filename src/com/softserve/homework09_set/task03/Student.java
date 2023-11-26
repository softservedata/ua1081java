package com.softserve.homework09_set.task03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student>{
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    @Override
    public int compareTo(Student student) {
        return 0;
    }


    public static class CompareByName implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getName().compareTo(st2.getName());
        }
    }

    public static class CompareByCourse implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getCourse() - st2.getCourse();
        }
    }
}
