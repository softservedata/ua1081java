package com.softserve.edu.lesson_7_Nested.homework.hw_1;

public abstract class Person implements Cloneable{
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println("Name: " + fullName.getName() + "Surname: " + fullName.getSurname() + "Age: " + age);
    }

    public abstract String activity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        clone.fullName = (FullName) fullName.clone();
        return clone;
    }
}
