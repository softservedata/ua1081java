package com.softserve.homework07_inner_class_clon.task01;

public abstract class Person implements Cloneable {
    protected FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println("First name: " + getFullName().getFirstName()
                + "\nLast name: " + getFullName().getLastName() + "\nAge: " + getAge());
    }

    public abstract String activity();

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person copyOfPerson = (Person) super.clone();
        copyOfPerson.fullName = (FullName)copyOfPerson.fullName.clone();
        return copyOfPerson;
    }
}
