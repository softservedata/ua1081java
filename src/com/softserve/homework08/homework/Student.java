package com.softserve.homework08.homework;

public class Student extends Person implements Cloneable{
    private int courseNumber;

    public Student(FullName fullName, int age, int courseNumber) {
        super(fullName, age);
        this.courseNumber = courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + courseNumber;
    }

    @Override
    public String activity() {
        return "I study at university (course - " + courseNumber + ").";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student studentClone = (Student) super.clone();
        studentClone.setFullName((FullName) getFullName().clone());
        return studentClone;
    }
}
