package com.softserve.edu.lesson_2_OOP.homeworks.hw_3;

import java.time.LocalDate;



public class Person {
    private String name;
    private String surname;
    private int birthYear;

    public int getAge() {
        int year = LocalDate.now().getYear();
        if ((this.birthYear > 0) && (this.birthYear <= year)) {
            return year - this.birthYear;
        } else {
            throw new IllegalArgumentException("Please enter correct birthday year");
        }

    }

    public void input() {
        System.out.println("Enter name:");
        this.name = Main.SCANNER.nextLine();
        System.out.println("Enter surname:");
        this.surname = Main.SCANNER.nextLine();
        System.out.println("Enter birth year");
        this.birthYear = Main.SCANNER.nextInt();
        Main.SCANNER.nextLine();

    }

    public void output() {
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Bith Year: " + this.birthYear);
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
