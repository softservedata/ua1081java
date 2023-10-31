/*
3*. Create Console Application and add class called Person to the project. Class Main_Person should consist of:
• three private fields: firstName, lastName and birthYear (the birthday year);
• properties for access to these fields;
• default constructor and constructor with 2 parameters (first and last names);
• Methods:
• (**) getAge() - to calculate the age of a person;
• input() - to input information about the person;
• output() - to output information about the person;
• changeName(String fn, String ln) - to change the first name or/and last name.
In the main() method create 5 objects of Person type and input information about them to console.
 */
package Homework_02_Ivan.Homework;

import java.util.Scanner;

public class Main_Person {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String [] args) {
        Person person1 = new Person();
        Person.input(person1);
        Person.output(person1);

        boolean changesMade1 = promptForChanges(person1);
        if (changesMade1) {
            Person.output(person1);
        }

        Person person2 = new Person();
        Person.input(person2);
        Person.output(person2);

        boolean changesMade2 = promptForChanges(person2);
        if (changesMade2) {
            Person.output(person2);
        }

        Person person3 = new Person();
        Person.input(person3);
        Person.output(person3);

        boolean changesMade3 = promptForChanges(person3);
        if (changesMade3) {
            Person.output(person3);
        }

        Person person4 = new Person();
        Person.input(person4);
        Person.output(person4);

        boolean changesMade4 = promptForChanges(person4);
        if (changesMade4) {
            Person.output(person4);
        }

        Person person5 = new Person();
        Person.input(person5);
        Person.output(person5);

        boolean changesMade5 = promptForChanges(person5);
        if (changesMade5) {
            Person.output(person5);
        }
    }

    public static boolean promptForChanges(Person person) {
        System.out.println("Do you want to make changes to " + person.getFirstName() + " " + person.getLastName() + "? (yes/no)");
        String answer = SCANNER.nextLine().toLowerCase();

        boolean changesMade = false;

        if (answer.equals("yes")) {
            System.out.println("Enter new first name (or leave it blank to keep it unchanged):");
            String newFirstName = SCANNER.nextLine();
            System.out.println("Enter new last name (or leave it blank to keep it unchanged):");
            String newLastName = SCANNER.nextLine();

            changesMade = person.changeName(newFirstName, newLastName);
        }

        return changesMade;
    }
}
