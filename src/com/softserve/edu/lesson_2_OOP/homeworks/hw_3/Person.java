package com.softserve.edu.lesson_2_OOP.homeworks.hw_3;

import java.time.LocalDate;



public class Person {
    private String name;
    private String surname;
    private int birthYear;

    public int getAge(){
        int year = LocalDate.now().getYear();
        if ((this.birthYear > 0) && (this.birthYear <= year)) {
            return year - this.birthYear;
        } else {
            throw new IllegalArgumentException("Please enter correct birthday year");
        }

    }

    public void input() {
        System.out.println("Enter name:");
        name = Main.SCANNER.next();
        System.out.println("Enter surname:");
        surname = Main.SCANNER.next();
        System.out.println("Enter birth year");
        birthYear = Main.SCANNER.nextInt();
    }

    public void output() {
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Birth Year: " + this.birthYear);
        System.out.println("Age: " + getAge());
        System.out.println();
    }

    public void changeName(String fn, String in) {
        setName(fn);
        setSurname(in);
    }


    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
//Input Method Dependency:
// The input method relies on a scanner from the Main class (Main.SCANNER).
// This creates a tight coupling between your Person class and the Main class.
// It would be better to pass the Scanner object as a parameter to the input method to reduce dependency
// and increase the reusability of the Person class.
//

//The input and output methods are handling both input/output operations and setting/getting the properties
// of a Person.
// It might be better to separate these concerns.
// For example, you could have a separate class or methods in the Main class to handle user interaction,
// and keep the Person class focused on representing a person.