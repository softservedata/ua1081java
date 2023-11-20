package com.softserve.edu.lesson_9_MapSet.homework.hw_3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private int course;

    public static class ByNameAndCourse implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            int byName = student1.getName().compareTo(student2.getName());
            if (byName == 0) {
                return student1.getCourse() - student2.getCourse();
            }
            return byName;
        }
    }


    public Student(String name, int course) {
        this.name = name;
        this.course = course;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    static void printStudents(List<Student> list, int course) {
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            if (next.getCourse() == course) {
                System.out.println(next);
            }
        }
    }

    static void display(List<Student>list){
        for (Student student : list) {
            System.out.println(student);
        }
    }
}


