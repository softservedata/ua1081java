package com.softserve.practical05.ex04;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeSearcher {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Employee emp1 = new Employee("Jake", 1, 1000);
        Employee emp2 = new Employee("Jenny", 3, 1150);
        Employee emp3 = new Employee("Alex", 6, 900);
        Employee emp4 = new Employee("Drew", 4, 1650);
        Employee emp5 = new Employee("Stan", 3, 1500);
        Employee[] arrayOfEmployees = {emp1, emp2, emp3, emp4, emp5};
        int input;

        //find by department number
        System.out.println("Please, input number of a department: ");
        if (sc.hasNextInt()) {//checks if int is input
            input = sc.nextInt();
            if (input > 0) {
                for (Employee employee : arrayOfEmployees) {
                    if (employee.getDepartmentNumber() == input) {
                        System.out.println(employee);
                    }
                }
            } else
                System.out.println("Please, input a positive number of department");
        } else
            System.out.println("Please, input valid data");

        //sorting by salary
        Employee[] sortedArray = arrayOfEmployees.clone();
        for (int i = 0; i < sortedArray.length - 1; i++){
            for (int j = sortedArray.length-1; j > i; j--){
                Employee tmp = sortedArray[i];
                if (sortedArray[j].getSalary() > sortedArray[i].getSalary()) {
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(sortedArray));

    }
}
