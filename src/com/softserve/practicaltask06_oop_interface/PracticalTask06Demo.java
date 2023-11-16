package com.softserve.practicaltask06_oop_interface;

import com.softserve.practicaltask06_oop_interface.practask01.Animal;
import com.softserve.practicaltask06_oop_interface.practask01.Cat;
import com.softserve.practicaltask06_oop_interface.practask01.Dog;
import com.softserve.practicaltask06_oop_interface.practask02.*;

public class PracticalTask06Demo {
    public static void main(String[] args) {
//        Task 01 Create an interface called Animal with methods voice() and feed(). Create two classes
//        Cat and Dog, which implement this interface. In main() method create an array of Animal
//        and add some Cats and Dogs to it. Call voice() and feed() method for all of it.

        System.out.println("Demo of task 1");
        Animal[] animals = {new Cat(), new Cat(), new Dog(), new Dog()};
        for (Animal animal : animals) {
            animal.feed();
            animal.voice();
            System.out.println();
        }


//        Task 02 Realize next structure of classes. In abstract class
//        Person with property name, declare abstract
//        method print(). In other extended classes in body of
//        method print() output text “I am a …”. In class Staff declare abstract method salary(). In each concrete
//        class create constant TYPE_PERSON. Output type of
//        person in each constructors. In main() method
//        create an array of Person and add some Teachers, Cleaners and Students. Call method print() for all of
//        it. Call method salary() for all Teachers and Cleaners.

        System.out.println("Demo of task 2");
        Person[] people = {
                new Student("Kate"),
                new Teacher("Olha"),
                new Cleaner("Ivan"),
                new Student("Tom"),
                new Cleaner("Lana")};
        for (Person person : people) {
            person.print();
            if (person instanceof Teacher) {
                ((Teacher) person).salary();
            } else if (person instanceof Cleaner) {
                ((Cleaner) person).salary();
            }
            System.out.println();
        }

    }
}
