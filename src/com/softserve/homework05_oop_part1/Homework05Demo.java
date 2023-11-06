package com.softserve.homework05_oop_part1;

import com.softserve.homework05_oop_part1.task01_oop.*;
import com.softserve.homework05_oop_part1.task02_oop.Developer;
import com.softserve.homework05_oop_part1.task02_oop.Employee;


public class Homework05Demo {
    public static void main(String[] args) {
//        Task 01
//        1. Create abstract class called Bird by scheme with attributes feathers and layEggs and an
//           abstaract fly()method.
//        2. Create classes FlyingBird and NonFlyingBird.
//        3. Create classes Eagle, Swallow, Penguin and Kiwi.
//        4. In main () method create an array Bird and add different birds to it.Call fly () method for
//        all of it.Output the information about each type of created bird.


        Eagle eagle = new Eagle("Brown",true);
        Swallow swallow = new Swallow("Black",false);
        Penguin penguin = new Penguin("White", true);
        Kiwi kiwi = new Kiwi("Green",false);
        Bird[] array = new Bird[]{eagle, swallow, penguin, kiwi};
        for (int i = 0; i < array.length; i++) {
            array[i].fly();
            System.out.println(array[i] + "\n");
        }


//        Task 02 Create a class called Developer that extends the Employee class. Define a String field
//        and a constructor to initialize all fields in the Developer class.
//          • In the Developer class, override the report() method to return a string with information
//        about the developer, for example:
//        Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
//          • If necessary, modify the Employee class to adhere to the principles of encapsulation and
//        inheritance.
//          • In main() method create an instance of both the Employee and Developer classes and
//        print information about them in the console using report() method.

        Employee employee = new Employee("Taras", 32, 32735.35);
        Developer developer = new Developer("Taras", 32, "Java developer", 32735.35);
        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
