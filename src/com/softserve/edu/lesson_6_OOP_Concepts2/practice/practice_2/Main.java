package com.softserve.edu.lesson_6_OOP_Concepts2.practice.practice_2;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Teacher("Ira");
        people[1] = new Cleaner("Roman");
        people[2] = new Student("Bogdan");
        people[3] = new Cleaner("Ivanna");
        people[4] = new Teacher("Igor");

        for (Person person : people) {
            person.print();
            if (person instanceof Teacher || person instanceof Cleaner) {
                ((Staff) person).salary();
            }


        }
    }
}
