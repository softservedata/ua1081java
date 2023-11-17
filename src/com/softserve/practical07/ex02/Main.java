package com.softserve.practical07.ex02;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Teacher("Mike"),
                new Cleaner("Darryl"),
                new Student("Ben")
        };

        for (Person person : people) {
            person.print();
            if (person instanceof Teacher || person instanceof Cleaner) {
                ((Staff) person).salary();
            }
        }
    }
}
