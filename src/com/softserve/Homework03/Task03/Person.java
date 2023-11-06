package com.softserve.Homework03.Task03;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private short birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public short getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(short birthYear) {//better to use LocalDate
        if (birthYear > 0 && birthYear <= 2023) {
            this.birthYear = birthYear;
        }
    }

    public byte getAge() {
        return (byte) (2023 - birthYear);
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter first name: ");
        setFirstName(scanner.nextLine());
        System.out.print(" Enter last name: ");
        setLastName(scanner.nextLine());
        System.out.print(" Enter birth year: ");
        setBirthYear(scanner.nextShort());
    }

    public void output() {
        System.out.println(" Person info ");
        System.out.println("Name: " + firstName + "\tLast name: "
                + lastName + "\nBirth year: " + birthYear + "\t Age person: " + getAge());
    }

    public void changeName(String firstName, String lastName) {
        if (firstName != null) {
            setFirstName(firstName);
        }
        if (lastName != null) {
            setLastName(lastName);
        }
    }
}
