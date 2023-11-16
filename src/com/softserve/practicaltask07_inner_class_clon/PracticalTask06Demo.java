package com.softserve.practicaltask07_inner_class_clon;

import com.softserve.practicaltask07_inner_class_clon.task01.Department;

public class PracticalTask06Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Task 01  Create a class called Department that contains a name field of String type and an address
//                field of Address type.
//              • In the Department class, create an inner class called Address with has city and street
//                fields of String type and building field of type int.
//              • In main() method, create an instance for one department and initialize it.
//              • Then, create one more department by cloning previously created department and change
//        the city for this object.
//              • Output information about all departments to the console.

        Department.Address department1 = new Department("Economy").new Address("Dnipro", "Shevchenko", 19);
        Department.Address department2 = (Department.Address) department1.clone();
        department2.setCity("Lviv");
        System.out.println(department1);
        System.out.println(department2);
    }
}
