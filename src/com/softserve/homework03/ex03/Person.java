package com.softserve.homework03.ex03;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        input();
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, insert first name: ");
        firstName = sc.nextLine();
        System.out.print("Please, insert last name: ");
        lastName = sc.nextLine();
        System.out.print("Please, insert birth year: ");
        birthYear = sc.nextInt();
    }

    public void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    public void output() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", age=" + getAge() +
                '}';
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
}
