package com.softserve.Homework10.Task3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }
    static class byName implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2){
            return st1.getName().compareTo(st2.getName());
        }
    }
    static class byCourse implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2){
            return st1.getCourse()-st2.getCourse();
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return  name+ " " + course;
    }

    public static void printStudents(List<Student> studentList, int course){
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

}
