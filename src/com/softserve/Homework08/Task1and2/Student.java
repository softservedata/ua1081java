package com.softserve.Homework08.Task1and2;

public class Student extends Person {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return "First name: " + super.getFullName().getFirstName() +
                ", Last name: " + super.getFullName().getLastName() +
                ", Age: " + super.getAge()+", Course: "+course;

    }
    @Override
    public String activity(){
        return "I study at university";
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
