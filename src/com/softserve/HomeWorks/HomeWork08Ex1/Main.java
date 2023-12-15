package com.softserve.HomeWorks.HomeWork08Ex1;

abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public abstract String activity();

    public String info() {
        return String.format("First name: %s, Last name: %s, Age: %d",
                fullName.getFirstName(), fullName.getLastName(), age);
    }
}

class ExamplePerson extends Person {
    public ExamplePerson(FullName fullName, int age) {
        super(fullName, age);
    }

    @Override
    public String activity() {
        return "Example activity";
    }
}

public class Main {
    public static void main(String[] args) {
        FullName fullName = new FullName("John", "Doe");
        Person person = new ExamplePerson(fullName, 25);

        // Output information and activity for the person
        System.out.println(person.info());
        System.out.println("Activity: " + person.activity());
    }
}

