package Homework_02_Ivan.Practical_02;

import java.util.Scanner;

import static Homework_02_Ivan.Practical_02.Employee.printEmployeeSalary;

public class MainEmployee {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee.promptParameters(employee1);
        Employee.setTotalSum(Employee.getTotalSum()+ employee1.getSalary());

        Employee employee2 = new Employee();
        Employee.promptParameters(employee2);
        Employee.setTotalSum(Employee.getTotalSum()+ employee2.getSalary());

        Employee employee3 = new Employee();
        Employee.promptParameters(employee3);
        Employee.setTotalSum(Employee.getTotalSum()+ employee3.getSalary());

        printEmployeeSalary();
    }


}