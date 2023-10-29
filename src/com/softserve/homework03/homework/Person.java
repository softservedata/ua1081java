package com.softserve.homework03.homework;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName= lastName;
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

    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - getBirthYear();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the person's first name: ");
        String fn = scanner.nextLine();
        setFirstName(fn.substring(0, 1).toUpperCase() + fn.substring(1).toLowerCase());
        System.out.print("Enter the person's last name: ");
        String ln = scanner.nextLine();
        setLastName(ln.substring(0, 1).toUpperCase() + ln.substring(1).toLowerCase());
        System.out.print("Enter the person's date of birth: ");
        setBirthYear(scanner.nextInt());
    }

    public void output() {
        System.out.println("\nPersonal information: \n    First Name: " + getFirstName() +
                "\n    Last Name: " + getLastName() +
                "\n    Birth Year: " + getBirthYear() +
                "\n    Age: " + getAge());
    }

    public void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    public static void main(String[] args) {

        //Fist person created
        Person firstPerson = new Person();
        firstPerson.setFirstName("Nataliia");
        firstPerson.setLastName("Kondratenko");
        firstPerson.setBirthYear(1987);

        //Second person created
        Person secondPerson = new Person("Taras", "Petrenko");
        secondPerson.setBirthYear(1977);

        //Third person created
        Person thirdPerson = new Person("Ostap", "Sarancha");
        thirdPerson.setBirthYear(1939);
        thirdPerson.changeName("Ivan", "Kolyada");

        //Fourth person created
        Person fourthPerson = new Person();
        fourthPerson.input();

        //Fifth person created
        Person fifthPerson = new Person();
        fifthPerson.input();

        //Return info about all people created
        firstPerson.output();
        secondPerson.output();
        thirdPerson.output();
        fourthPerson.output();
        fifthPerson.output();
    }
}
