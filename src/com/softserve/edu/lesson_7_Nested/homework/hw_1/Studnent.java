package com.softserve.edu.lesson_7_Nested.homework.hw_1;

public class Studnent  extends Person implements Cloneable{
    private int course;

    public Studnent(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public void info() {
        System.out.println("Name: " + getFullName().getName() + ", Surname: " + getFullName().getSurname()
                + ", Age: " + getAge() + ", Course: " + course);
    }

    @Override
    public String activity() {
        String act = "I study at the univercity";
        return act;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return  super.clone();
    }
}
