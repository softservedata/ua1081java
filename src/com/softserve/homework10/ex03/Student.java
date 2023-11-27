package com.softserve.homework10.ex03;

import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudents(List<Student> students, int course) {
        if (!students.isEmpty()) {
            int counter = 0;
            System.out.printf("Students, enrolled to course №%d:%n", course);

            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
                Student nextStudent = iterator.next();
                if (nextStudent.getCourse() == course) {
                    System.out.println(nextStudent);
                    counter++;
                }
            }
            if (counter == 0) System.out.printf("There are no students enrolled to course №%d%n", course);

        } else System.out.println("There are no students in the list");
    }

    public static List<Student> sortByCourseAscending(List<Student> students) {
        students.sort(new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getCourse() - o2.getCourse();
            }
        });
        return students;
    }

    public static List<Student> sortByNameDescending(List<Student> students) {
        students.sort(new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return students;
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
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getCourse() == student.getCourse() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCourse());
    }

    @Override
    public int compareTo(Student o) {
        if (course != o.course) {
            return Integer.compare(o.course, course);
        } else {
            return name.compareTo(o.name);
        }
    }
}
