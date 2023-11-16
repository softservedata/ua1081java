package com.softserve.homework07_inner_class_clon.task01;

public class Student extends Person implements Cloneable{
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Course: " + course);

    }

    @Override
    public String activity() {
        return "I am studying at university";
    }

    @Override
    public String toString() {
        return "Student " + getFullName() + " " + getAge() + " " +
                "course=" + course +
                ' ';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student copyOfStudent = (Student) super.clone();
        copyOfStudent.fullName = (FullName)copyOfStudent.fullName.clone();
        return copyOfStudent;
    }
}
