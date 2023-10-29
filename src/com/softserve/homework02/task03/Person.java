package com.softserve.homework02.task03;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    Scanner scanner = new Scanner(System.in);
    LocalDate localDate = LocalDate.now();

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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void getAge() {
        int year = localDate.getYear();
        birthYear = getBirthYear();
        int age = year - birthYear;
        System.out.println("Age of a person: " + age);
    }

    public void input() {
        System.out.println("Enter first name of person: ");
        String firstName = scanner.nextLine();
        setFirstName(firstName);
        System.out.println("Enter last name of person: ");
        String lastName = scanner.nextLine();
        setLastName(lastName);
        System.out.println("Enter birth year of person: ");
        int birthYear = scanner.nextInt();
        setBirthYear(birthYear);
    }


    public void output() {
        String firstName = getFirstName();
        String lastName = getLastName();
        int birthYear = getBirthYear();
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Birth year: " + birthYear);
    }

    public void changeName(String newFirstName, String newLastName) {
        setFirstName(newFirstName);
        setLastName(newLastName);
        System.out.println("New First name is " + getFirstName() + "\n" + "New Last name is "
                + getLastName());
    }
}
