package com.softserve.homework02;

import java.time.Year;
import java.util.Scanner;

public class Person {

    Person[] personArray = new Person[5];
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    public void inputInformationOfPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter first name: ");
        setFirstName(scanner.nextLine());
        System.out.print(" Enter last name: ");
        setLastName(scanner.nextLine());
        System.out.print(" Enter birth year: ");
        setBirthYear(scanner.nextInt());
    }

    public void outputInformationOfPerson() {
        System.out.println("\nPersonal information: \n    First Name: " + getFirstName() +
                "\n    Last Name: " + getLastName() +
                "\n    Birth Year: " + getBirthYear() +
                "\n    Age: " + getAge());
    }


    public void changeName(String firstName, String lastName) {
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

    public void programMenu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Select the desired menu\n 1. Input information about person\n 2. Get information about person\n 3. Change information about person\n 4. Exit");
            Scanner scanner = new Scanner(System.in);
            int menuinput = scanner.nextInt();
            if (menuinput == 1) {
                for (int i = 0; i < personArray.length; i++) {
                    System.out.println("insert information about " + (i + 1) + " person");
                    personArray[i] = new Person();
                    personArray[i].inputInformationOfPerson();
                }
            } else if (menuinput == 2) {
                for (int i = 0; i < personArray.length; i++) {
                    System.out.println("get information about " + (i + 1) + " person");
                    personArray[i].outputInformationOfPerson();
                }
            } else if (menuinput == 3) {
                System.out.println("Select person for change");
                Scanner sr = new Scanner(System.in);
                Scanner scannerInt = new Scanner(System.in);
                int selectedPerson = scannerInt.nextInt();
                for (int i = 0; i < personArray.length; i++) {
                    if (i == selectedPerson - 1) {
                        personArray[i].changeName(getFirstName(), getLastName());
                        System.out.print(" Enter first name: ");
                        personArray[i].setFirstName(sr.nextLine());
                        System.out.print(" Enter last name: ");
                        personArray[i].setLastName(sr.nextLine());

                        personArray[i].outputInformationOfPerson();
                    }
                }
            } else if (menuinput == 4) {
                System.out.println("Have a nice day! Buy!");
                exit = true;
            }
        }
    }
}

