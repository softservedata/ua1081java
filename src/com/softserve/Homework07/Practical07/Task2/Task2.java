package com.softserve.Homework07.Practical07.Task2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Creating peoples:");
        Person[] people = new Person[3];
        people[0] = new Student();
        people[1] = new Cleaner(14.5);
        people[2] = new Teacher(25.5);
        System.out.println("-------------------");
        for (Person person: people) {
            System.out.print("\n Person: ");
            person.print();
        }
    }
}
