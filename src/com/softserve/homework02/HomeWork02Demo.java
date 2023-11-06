package com.softserve.homework02;

import com.softserve.homework02.task01.Triangle;
import com.softserve.homework02.task02.Numbers;
import com.softserve.homework02.task03.Person;

public class HomeWork02Demo {
    public static void main(String[] args) {
//        Task 1 Write Java console application with method to calculate the area of a triangle.

        Triangle.calculateAreaOfTriangle();

//        Task 2 Write Java console application with method to find the smallest number among three integer numbers

        Numbers.findSmallestNumber(3,Numbers.scanner);

//       Task 3 Create Console Application and add class called Person to the project. Class Person should consist of:
//          • three private fields: firstName, lastName and birthYear (the birthday year);
//          • properties for access to these fields;
//          • default constructor and constructor with 2 parameters (first and last names);
//          • Methods:
//          • (**) getAge() - to calculate the age of a person;
//          • input() - to input information about the person;
//          • output() - to output information about the person;
//          • changeName(String fn, String ln) - to change the first name or/and last name.
//        In the main() method create 5 objects of Person type and input information about them to console.

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        person1.input();
        person2.input();
        person3.input();
        person4.input();
        person5.input();

        person1.getAge();
        person2.output();
        person3.changeName("Flora","Nelson");

    }
}
