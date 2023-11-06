package com.softserve.practicaltask04_arrays_loops;

import com.softserve.practicaltask04_arrays_loops.practask01.PracticalTask01;
import com.softserve.practicaltask04_arrays_loops.practask02.PracticalTask02;
import com.softserve.practicaltask04_arrays_loops.practask03.PracticalTask03;
import com.softserve.practicaltask04_arrays_loops.practask04.Employee;

public class PracticalTaskDemo04 {
    public static void main(String[] args) {

//        Task 01 Write a Java program that performs the following tasks and outputs the results:
//          • Create a string array and sort it.
//          • Create an array with 5 elements and calculate the average value
//          • Сheck if the array (any of the previous ones) contains the value ( value enter from the
//         console). Output the result of the search.

        PracticalTask01.createStringArrayAndSortArray();
        PracticalTask01.calcAverageNumberUsingArray();
        PracticalTask01.checkArrayContainsEnteredNumber();

//        Task 02 Write a Java program that asks the user to enter a positive integer and determines
//        whether it is a prime number. If the number is prime, output a message “Is a prime
//        number”. Otherwise, output a message “Is not prime number”.

        PracticalTask02.isPrimeNumber();

//        Task 03 Create an array of ten random integers using a random number generator. Output:
//          • the biggest number in the array;
//          • the sum of positive numbers;
//          • count the number of negative numbers.
//          • determine whether there are more negative or positive values in the array. If there are
//        more negative values, output "There are more negative values in the array." Otherwise,
//        output "There are more positive values in the array." If the counts are equal, output
//        "There are an equal number of positive and negative values in the array

        PracticalTask03.getCalculationUsingRandomNumbers();

//        Task 04 Create a class called Employee with fields: name, department number, salary.
//          • In main() method create five objects of class Employee.
//          • Output results for:
//        o all employees of a certain department (input department number in the console);
//        o arrange workers by the field salary in descending order.

        Employee employee1 = new Employee("Nik", 2, 22500.0);
        Employee employee2 = new Employee("Tom", 1, 13500.0);
        Employee employee3 = new Employee("Lana", 2, 10500.0);
        Employee employee4 = new Employee("Poll", 1, 8500.0);
        Employee employee5 = new Employee("Matt", 2, 55500.0);

        Employee.getAllEmployeesOfCertainDepartment(employee1, employee2, employee3, employee4, employee5);
        System.out.println();

        Employee.displayEmployeeSalaryInDescendingOrder(employee1, employee2, employee3, employee4, employee5);
    }
}
