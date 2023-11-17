package homework9.h2;

import java.util.*;

public class Student {
    private String name;
    private int group;
    private int course;
    private int gradesMath;
    private int gradesLanguage;

    public Student(String name, int group, int course, int gradesMath, int gradesLanguage) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.gradesMath = gradesMath;
        this.gradesLanguage = gradesLanguage;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", gradesMath=" + gradesMath +
                ", gradesLanguage=" + gradesLanguage +
                '}';
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public int getGradesMath() {
        return gradesMath;
    }

    public int getGradesLanguage() {
        return gradesLanguage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return group == student.group && course == student.course && gradesMath == student.gradesMath && gradesLanguage == student.gradesLanguage && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, course, gradesMath, gradesLanguage);
    }

    public int average() {
        return (gradesMath + gradesLanguage) / 2;
    }


    public void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("That course has next student: " + student.getName());
            }
        }
    }

    public void removeStudent(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            if (next.average() < 3) {
                iterator.remove();
            }
        }
    }
}
















