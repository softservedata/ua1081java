package com.softserve.Homework03.Practical03.Task02;

import com.softserve.Homework03.Task03.Person;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        input();
    }

    public static void input() {
        Employee[] employeeArray = new Employee[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < employeeArray.length; i++) {
            System.out.println(" Creating employee #" + (i + 1));
            employeeArray[i] = new Employee();
            System.out.print(" Enter name: ");
            employeeArray[i].setName(scanner.nextLine());
            System.out.print(" Enter rate: ");
            employeeArray[i].setRate(scanner.nextDouble());
            System.out.print(" Enter hours: ");
            employeeArray[i].setHours(scanner.nextShort());
            System.out.println(employeeArray[i]);
            scanner.nextLine();
        }
        System.out.println(" Total salary: " + Employee.totalSum);
    }
}
